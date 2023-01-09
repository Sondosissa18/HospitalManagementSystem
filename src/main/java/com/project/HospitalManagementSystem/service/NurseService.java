package com.project.HospitalManagementSystem.service;


import com.project.HospitalManagementSystem.model.Nurse;

import java.util.List;

public interface NurseService {

    List<Nurse> allNurse();

    void addNurse(Nurse nurse);

    Nurse updateNurseInfo(Long id, Nurse nurse);

    void deleteNurse(Long id);

    Nurse getNurseById(Long id);



}
