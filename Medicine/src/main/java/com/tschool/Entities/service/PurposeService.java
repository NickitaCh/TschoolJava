package com.tschool.Entities.service;

import com.tschool.Entities.Medicament;
import com.tschool.Entities.Purpose;

import java.util.List;

public interface PurposeService {
    Purpose addPurpose(Purpose purpose);
    void deletePurpose(int id);
    Purpose getPurpose(String name);
    Purpose editPurpose(Purpose purpose);
    List<Purpose> getAll();
}
