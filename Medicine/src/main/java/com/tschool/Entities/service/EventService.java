package com.tschool.Entities.service;

import com.tschool.Entities.Event;

import java.util.List;

public interface EventService {
    Event addEvent(Event event);
    void deleteEvent(int id);
    Event getEvent(String name);
    Event editEvent(Event event);
    List<Event> getAll();
}
