package com.project.HospitalManagementSystem.repository;

import com.project.HospitalManagementSystem.model.Patients;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientsRepository extends JpaRepository<Patients, Long> {

    @Query(value = "SELECT COUNT(*) FROM Patients")
    Long countPatient();

}
