package com.tschool.Entities.service;

import com.tschool.Entities.Medicament;
import com.tschool.Entities.Patient;

import java.util.List;

public interface PatientService {
    Patient addPatient(Patient patient);
    void deletePatient(int id);
    Patient getPatient(String name);
    Patient editPatient(Patient patient);
    List<Patient> getAll();
}
