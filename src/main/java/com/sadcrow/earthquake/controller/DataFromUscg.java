package com.sadcrow.earthquake.controller;


import com.sadcrow.earthquake.helpers.DateSetup;
import com.sadcrow.earthquake.helpers.EventLocation;
import com.sadcrow.earthquake.helpers.WebServices;
import com.sadcrow.earthquake.dto.readServiceDto.Feature;
import com.sadcrow.earthquake.dto.readServiceDto.MainRequestDtoUSCG;
import com.sadcrow.earthquake.entities.Event;
import com.sadcrow.earthquake.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/info")
public class DataFromUscg {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private WebServices webServices;

    @GetMapping("/")
    @Scheduled(cron = "0 */5 * * * *")
    public void requestInfo() throws IOException {

        DateSetup date = new DateSetup(1);
        MainRequestDtoUSCG data = webServices.getUscgInfo(date.getStringFormatedDate());
        List<Event> currentEventList = eventRepository.findByCreationDateGreaterThanEqual(date.getDateFrom());

        List<Event> eventListFromData = new ArrayList<>();
        for (Feature e: data.getFeatures()) {
            Event event = new Event();
            event.set_id(e.getId());
            event.setRefId(e.getId());
            event.setEventDate(new Date((long)e.getProperties().getTime()));
            event.setMagnitud(e.getProperties().getMagnitude().toString());
            EventLocation eventLocation = new EventLocation(e.getGeometry().getCoordinates());
            event.setLocation(eventLocation.getGeoJsonPoint());
            eventListFromData.add(event);
        }

        int i = 0;
        for (Event eventFromData: eventListFromData) {
            if(currentEventList.contains(eventFromData)){
                //update
                currentEventList.get(i).setLocation(eventFromData.getLocation());
                currentEventList.get(i).setMagnitud(eventFromData.getMagnitud());
            } else {
                currentEventList.add(eventFromData);
            }
            i++;
        }

        System.out.println("refresh!");
        eventRepository.saveAll(currentEventList);
    }
}
