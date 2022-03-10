package com.tschool.Entity.service;

import com.tschool.Entity.Patient;
import com.tschool.Entity.service.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DoctorService {
    @Autowired
    PatientRepository patientRepository;

    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }

    public void deletePatient(int id) {
        patientRepository.deleteById(id);
    }

    public Patient getPatient(String name) {
        return patientRepository.findByName(name);
    }

    public void editPatient(Patient patient) {
        patientRepository.save(patient);
    }

    public List<Patient> getAll() {
        return (List<Patient>) patientRepository.findAll();
    }

}
