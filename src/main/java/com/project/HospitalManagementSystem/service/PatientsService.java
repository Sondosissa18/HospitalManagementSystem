package com.project.HospitalManagementSystem.service;


import com.project.HospitalManagementSystem.model.Patients;

import java.util.List;

public interface PatientsService {


    List<Patients> allPatients();

    void addPatients(Patients patients);

    Patients updatePatientsInfo(Long id,Patients patients);

    void deletePatients(Long id);

    Patients getPatientsById(Long id);
}
