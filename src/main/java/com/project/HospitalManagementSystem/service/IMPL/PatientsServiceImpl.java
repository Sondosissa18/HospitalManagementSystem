package com.project.HospitalManagementSystem.service.IMPL;

import com.project.HospitalManagementSystem.model.Patient;
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
    public List<Patient> allPatients() {
        return patientsRepository.findAll();
    }

    @Override
    public void addPatients(Patient patient) {
        patientsRepository.save(patient);

    }

    @Override
    public Patient updatePatientsInfo(Long id, Patient patient) {
        Patient updatePatient = patientsRepository.findById(id).orElseThrow(()->
               new RuntimeException("Patient id not found"));
        updatePatient.setName(patient.getName());
        updatePatient.setEmail(patient.getEmail());
        updatePatient.setPhoneNumber(patient.getPhoneNumber());
        patientsRepository.save(updatePatient);
        return patient;
    }

    @Override
    public void deletePatients(Long id) {
        patientsRepository.deleteById(id);
    }

    @Override
    public Patient getPatientsById(Long id) {
        return null;
    }


}
