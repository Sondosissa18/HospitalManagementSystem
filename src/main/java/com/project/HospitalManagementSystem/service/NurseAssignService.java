package com.project.HospitalManagementSystem.service;

import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.model.NurseAssigned;
import com.project.HospitalManagementSystem.model.Patient;

import java.util.List;

public interface NurseAssignService {

  NurseAssigned nurseAssign(String patientName,String nurseName);
}
