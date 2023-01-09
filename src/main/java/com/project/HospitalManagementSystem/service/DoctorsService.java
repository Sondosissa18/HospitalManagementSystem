package com.project.HospitalManagementSystem.service;


import com.project.HospitalManagementSystem.model.Doctors;

import java.util.List;

public interface DoctorsService {

        List<Doctors> allDoctors();

        void addDoctors(Doctors doctors);

        Doctors updateDoctorsInfo(Long id, Doctors doctors);

        void deleteDoctors(Long id);

        Doctors getDoctorsById(Long id);
}


