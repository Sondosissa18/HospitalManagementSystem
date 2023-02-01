package com.project.HospitalManagementSystem.repository;

import com.project.HospitalManagementSystem.model.NurseAssigned;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseAssignRepository extends JpaRepository<NurseAssigned,Long> {
}
