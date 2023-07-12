package com.example.Vaccinationbookingapplication.Repository;

import com.example.Vaccinationbookingapplication.Model.Dose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoseRepository extends JpaRepository<Dose,Integer> {
}
