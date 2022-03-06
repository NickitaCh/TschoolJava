package com.tschool.Entities.service.impl;

import com.tschool.Entities.Medicament;
import com.tschool.Entities.Repository.EventRepository;
import com.tschool.Entities.Repository.MedicamentRepository;
import com.tschool.Entities.service.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MedicamentServiceImpl implements MedicamentService {

    @Autowired
    private MedicamentRepository medicamentRepository;

    @Override
    public Medicament addMedicament(Medicament medicament) {
        return medicamentRepository.saveAndFlush(medicament);
    }

    @Override
    public void deleteMedicament(int id) {
        medicamentRepository.delete(medicamentRepository.getById(id));
    }

    @Override
    public Medicament getMedicament(String name) {
        return medicamentRepository.findByName(name);
    }

    @Override
    public Medicament editMedicament(Medicament medicament) {
        return medicamentRepository.saveAndFlush(medicament);
    }

    @Override
    public List<Medicament> getAll() {
        return medicamentRepository.findAll();
    }
}
