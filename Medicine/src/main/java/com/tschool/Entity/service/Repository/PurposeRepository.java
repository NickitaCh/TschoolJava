package com.tschool.Entity.service.Repository;

import com.tschool.Entity.Purpose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurposeRepository extends JpaRepository<Purpose, Integer> {

    @Query("SELECT b from Purpose b where b.patient = :patient")
    Purpose findByPatient(@Param("patient") String patient);

    Purpose addPurpose(Purpose purpose);
    void deletePurpose(int id);
    Purpose getPurpose(String name);
    Purpose editPurpose(Purpose purpose);
    List<Purpose> getAll();
}
