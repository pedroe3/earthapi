package com.sadcrow.earthquake.repositories;

import org.springframework.data.geo.Point;
import com.sadcrow.earthquake.entities.Event;
import org.springframework.data.geo.Distance;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface EventRepository extends MongoRepository<Event, String> {

    List<Event> findByCreationDateGreaterThanEqual(Date date);

    List<Event> findByLocationNear(Point p, Distance d);

}
