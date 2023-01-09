package com.project.HospitalManagementSystem.service;


import com.project.HospitalManagementSystem.model.Beds;
import com.project.HospitalManagementSystem.model.Complain;
import com.project.HospitalManagementSystem.model.Patients;

import java.util.List;

public interface BedService {

    List<Beds> allBedsList();

    void addBeds(Beds beds);

    Beds updateBedsInfo(Long id, Beds beds);

    void deleteBeds(Long id);


}
