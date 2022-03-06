package com.tschool.Entities.Repository;

import com.tschool.Entities.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MedicamentRepository extends JpaRepository<Medicament, Integer> {
    @Query("select b from Medicament b where b.name = :name")
    Medicament findByName(@Param("name") String name);
}
