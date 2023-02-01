package com.project.HospitalManagementSystem.service;

import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.model.Patients;

import java.util.List;

public interface NurseAssignService {

    Patients findPatientById(Long id);
    List<Nurse> allNurses();
}
