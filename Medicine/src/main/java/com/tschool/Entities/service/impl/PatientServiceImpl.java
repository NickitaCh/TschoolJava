package com.tschool.Entities.service.impl;

import com.tschool.Entities.Patient;
import com.tschool.Entities.Repository.MedicamentRepository;
import com.tschool.Entities.Repository.PatientRepository;
import com.tschool.Entities.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.saveAndFlush(patient);
    }

    @Override
    public void deletePatient(int id) {
        patientRepository.delete(patientRepository.getById(id));
    }

    @Override
    public Patient getPatient(String name) {
        return patientRepository.findByName(name);
    }

    @Override
    public Patient editPatient(Patient patient) {
        return patientRepository.saveAndFlush(patient);
    }

    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }
}
