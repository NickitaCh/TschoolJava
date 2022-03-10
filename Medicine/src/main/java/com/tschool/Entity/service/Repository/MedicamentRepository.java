package com.tschool.Entity.service.Repository;

import com.tschool.Entity.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MedicamentRepository extends JpaRepository<Medicament, Integer> {

    @Query("select b from Medicament b where b.name = :name")
    Medicament findByName(@Param("name") String name);

    Medicament addMedicament(Medicament medicament);
    void deleteMedicament(int id);
    Medicament getMedicament(String name);
    Medicament editMedicament(Medicament medicament);
    List<Medicament> getAll();
}
