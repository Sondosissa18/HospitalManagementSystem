package com.project.HospitalManagementSystem.service;


import com.project.HospitalManagementSystem.model.Patient;

import java.util.List;

public interface PatientsService {


    List<Patient> allPatients();

    void addPatients(Patient patient);

    Patient updatePatientsInfo(Long id, Patient patient);

    void deletePatients(Long id);

    Patient getPatientsById(Long id);

}
