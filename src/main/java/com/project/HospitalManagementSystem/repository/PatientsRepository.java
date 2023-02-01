package com.project.HospitalManagementSystem.repository;

import com.project.HospitalManagementSystem.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientsRepository extends JpaRepository<Patient, Long> {

    @Query(value = "SELECT COUNT(*) FROM Patient")
    Long countPatient();

    Patient findByName(String name);

}
