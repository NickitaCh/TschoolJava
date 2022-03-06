package com.tschool.Entities.service;

import com.tschool.Entities.Event;
import com.tschool.Entities.Medicament;

import java.util.List;

public interface MedicamentService {
    Medicament addMedicament(Medicament medicament);
    void deleteMedicament(int id);
    Medicament getMedicament(String name);
    Medicament editMedicament(Medicament medicament);
    List<Medicament> getAll();
}
