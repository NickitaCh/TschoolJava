package com.tschool.Entity.service.Repository;

import com.tschool.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Integer> {

    @Query("SELECT b from Event b where b.patient = :patient")
    Event findByPatient(@Param("patient") String patient);

    Event addEvent(Event event);

    void deleteEvent(int id);

    Event getEvent(String patient);

    Event editEvent(Event event);

    List<Event> getAll();
}
