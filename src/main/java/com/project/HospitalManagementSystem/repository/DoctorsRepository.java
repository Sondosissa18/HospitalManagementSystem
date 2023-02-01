package com.project.HospitalManagementSystem.repository;


import com.project.HospitalManagementSystem.model.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctors, Long> {

    @Query(value = "SELECT COUNT(*) FROM Doctors")
    Long countDoctors();
}
