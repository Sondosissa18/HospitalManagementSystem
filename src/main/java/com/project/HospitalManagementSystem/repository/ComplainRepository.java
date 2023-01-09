package com.project.HospitalManagementSystem.repository;

import com.project.HospitalManagementSystem.model.Beds;
import com.project.HospitalManagementSystem.model.Complain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplainRepository extends JpaRepository<Complain, Long> {

    @Query(value = "SELECT COUNT(*) FROM Complain")
    Long countComplain();
}
