package com.project.HospitalManagementSystem.repository;


import com.project.HospitalManagementSystem.model.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseRepository extends JpaRepository<Nurse, Long> {

    @Query(value = "SELECT COUNT(*) FROM Nurse")
    Long countNurse();

    Nurse findByName(String name);

}
