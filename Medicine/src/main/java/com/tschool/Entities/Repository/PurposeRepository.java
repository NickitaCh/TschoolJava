package com.tschool.Entities.Repository;

import com.tschool.Entities.Event;
import com.tschool.Entities.Purpose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PurposeRepository extends JpaRepository<Purpose, Integer> {

    @Query("SELECT b from Purpose b where b.patient = :patient")
    Purpose findByPatient(@Param("patient") String patient);
}
