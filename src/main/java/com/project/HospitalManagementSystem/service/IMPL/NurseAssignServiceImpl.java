package com.project.HospitalManagementSystem.service.IMPL;

import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.model.NurseAssigned;
import com.project.HospitalManagementSystem.model.Patient;
import com.project.HospitalManagementSystem.repository.NurseAssignRepository;
import com.project.HospitalManagementSystem.repository.NurseRepository;
import com.project.HospitalManagementSystem.repository.PatientsRepository;
import com.project.HospitalManagementSystem.service.NurseAssignService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NurseAssignServiceImpl implements NurseAssignService {

    private final PatientsRepository patientsRepository;
    private final NurseRepository nurseRepository;
    private final NurseAssignRepository nurseAssignRepository;

    @Override
    public NurseAssigned nurseAssign(String patientName, String nurseName) {
        Patient patients = patientsRepository.findByName(patientName);
        Nurse nurses = nurseRepository.findByName(nurseName);
        NurseAssigned assigned= new NurseAssigned();
        assigned.setPatientName(patients.getName());
        assigned.setNurseName(nurses.getName());
        nurseAssignRepository.save(assigned);
        return assigned;
    }
}
