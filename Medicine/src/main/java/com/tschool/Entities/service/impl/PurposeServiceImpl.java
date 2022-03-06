package com.tschool.Entities.service.impl;

import com.tschool.Entities.Purpose;
import com.tschool.Entities.Repository.PurposeRepository;
import com.tschool.Entities.service.PurposeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PurposeServiceImpl implements PurposeService {

    @Autowired
    private PurposeRepository purposeRepository;

    @Override
    public Purpose addPurpose(Purpose purpose) {
        return purposeRepository.saveAndFlush(purpose);
    }

    @Override
    public void deletePurpose(int id) {
        purposeRepository.delete(purposeRepository.getById(id));
    }

    @Override
    public Purpose getPurpose(String patient) {
        return purposeRepository.findByPatient(patient);
    }

    @Override
    public Purpose editPurpose(Purpose purpose) {
        return purposeRepository.saveAndFlush(purpose);
    }

    @Override
    public List<Purpose> getAll() {
        return purposeRepository.findAll();
    }
}
