package com.tschool.Entity.service.Repository;

import com.tschool.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

    @Query("select b from Patient b where b.name = :name")
    Patient findByName(@Param("name") String name);
//
//    Patient addPatient(Patient patient);
//    void deletePatient(int id);
//    Patient getPatient(String name);
//    Patient editPatient(Patient patient);
//    List<Patient> getAll();
}
