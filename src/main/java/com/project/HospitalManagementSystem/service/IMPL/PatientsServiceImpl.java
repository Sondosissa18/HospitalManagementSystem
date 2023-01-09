package com.project.HospitalManagementSystem.service.IMPL;

import com.project.HospitalManagementSystem.model.Patients;
import com.project.HospitalManagementSystem.repository.PatientsRepository;
import com.project.HospitalManagementSystem.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientsServiceImpl implements PatientsService {

    @Autowired
    private PatientsRepository patientsRepository;


    @Override
    public List<Patients> allPatients() {
        return patientsRepository.findAll();
    }

    @Override
    public void addPatients(Patients patients) {
        patientsRepository.save(patients);

    }

    @Override
    public Patients updatePatientsInfo(Long id, Patients patients) {
        Patients updatePatients = patientsRepository.findById(id).orElseThrow(()->
               new RuntimeException("Patients id not found"));
        updatePatients.setName(patients.getName());
        updatePatients.setEmail(patients.getEmail());
        updatePatients.setPhoneNumber(patients.getPhoneNumber());
        patientsRepository.save(updatePatients);
        return patients;
    }

    @Override
    public void deletePatients(Long id) {
        patientsRepository.deleteById(id);
    }

    @Override
    public Patients getPatientsById(Long id) {
        return null;
    }
}
