package com.sadcrow.earthquake.controller;

import com.sadcrow.earthquake.entities.Event;
import com.sadcrow.earthquake.helpers.EventLocation;
import com.sadcrow.earthquake.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/")
    private List<Event> getAllEvent(){
        return eventRepository.findAll();
    }

    @GetMapping("/longitude/{longitude}/latitude/{latitude}/distance/{distance}")
    public List<Event> getEventByLocation(@PathVariable Double longitude, @PathVariable Double latitude, @PathVariable Double distance){
        EventLocation location = new EventLocation(longitude, latitude);
        return eventRepository.findByLocationNear(location.getPoint(),new Distance(distance, Metrics.KILOMETERS));
    }
}
