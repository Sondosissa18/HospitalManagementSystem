package com.project.HospitalManagementSystem.repository;

import com.project.HospitalManagementSystem.model.Ambulance;
import com.project.HospitalManagementSystem.model.Beds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmbulanceRepository extends JpaRepository<Ambulance, Long> {
}
