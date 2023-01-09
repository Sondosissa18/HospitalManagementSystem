package com.project.HospitalManagementSystem.repository;


import com.project.HospitalManagementSystem.model.Beds;
import com.project.HospitalManagementSystem.model.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BedsRepository extends JpaRepository<Beds, Long> {

    @Query(value = "SELECT COUNT(*) FROM Beds")
    Long countBeds();

}
