package com.project.HospitalManagementSystem.service;

import com.project.HospitalManagementSystem.model.Ambulance;
import com.project.HospitalManagementSystem.model.Complain;
import java.util.List;


public interface AmbulanceService {

    List<Ambulance> allComplain();

    void addComplain(Ambulance ambulance);

    Ambulance updateAmbulanceInfo(Long id, Ambulance ambulance);

    void deleteComplain(Long id);

    Ambulance getAmbulanceById(Long id);

}
