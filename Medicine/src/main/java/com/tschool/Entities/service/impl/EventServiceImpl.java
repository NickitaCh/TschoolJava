package com.tschool.Entities.service.impl;

import com.tschool.Entities.Repository.EventRepository;
import com.tschool.Entities.Event;
import com.tschool.Entities.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event addEvent(Event event) {
        return eventRepository.saveAndFlush(event);
    }

    @Override
    public void deleteEvent(int id) {
        eventRepository.delete(eventRepository.getById(id));

    }

    @Override
    public Event getEvent(String patient) {
        return eventRepository.findByPatient(patient);
    }

    @Override
    public Event editEvent(Event event) {
        return eventRepository.saveAndFlush(event);
    }

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }
}
