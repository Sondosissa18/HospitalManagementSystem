package com.project.HospitalManagementSystem.service.IMPL;

import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.model.Patients;
import com.project.HospitalManagementSystem.repository.NurseRepository;
import com.project.HospitalManagementSystem.repository.PatientsRepository;
import com.project.HospitalManagementSystem.service.NurseAssignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NurseAssignServiceImpl implements NurseAssignService {

    @Autowired
    private NurseRepository nurseRepository;
    @Autowired
    private PatientsRepository patientsRepository;

    @Override
    public Patients findPatientById(Long id) {
        return patientsRepository.findById(id).orElse(null);
    }

    @Override
    public List<Nurse> allNurses() {
        return nurseRepository.findAll();
    }
}
