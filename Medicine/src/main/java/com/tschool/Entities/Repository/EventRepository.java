package com.tschool.Entities.Repository;

import com.tschool.Entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EventRepository  extends JpaRepository<Event, Integer> {

    @Query("SELECT b from Event b where b.patient = :patient")
    Event findByPatient(@Param("patient") String patient);
}
