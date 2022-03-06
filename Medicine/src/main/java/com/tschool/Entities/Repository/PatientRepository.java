package com.tschool.Entities.Repository;

import com.tschool.Entities.Medicament;
import com.tschool.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

    @Query("select b from Patient b where b.name = :name")
    Patient findByName(@Param("name") String name);
}
