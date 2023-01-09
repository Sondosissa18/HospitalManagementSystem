package com.project.HospitalManagementSystem.service.IMPL;

import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.repository.NurseRepository;
import com.project.HospitalManagementSystem.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NurseServiceImpl implements NurseService {

    @Autowired
    private NurseRepository nurseRepository;

    @Override
    public List<Nurse> allNurse() {
        return nurseRepository.findAll();
    }

    @Override
    public void addNurse(Nurse nurse) {
        nurseRepository.save(nurse);

    }

    @Override
    public Nurse updateNurseInfo(Long id, Nurse nurse) {
        Nurse updateNurse = nurseRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Nurse id not found"));
        updateNurse.setName(nurse.getName());
        nurseRepository.save(updateNurse);
        return nurse;

    }

    @Override
    public void deleteNurse(Long id) {
        nurseRepository.deleteById(id);
    }

    @Override
    public Nurse getNurseById(Long id) {
        Optional<Nurse> optional = nurseRepository.findById(id);
        Nurse nurse = null;
        if (optional.isPresent()) {
            nurse = optional.get();
        } else {
            throw new RuntimeException("Nurse Not found with this id::" + id);
        }
        return nurse;
    }
}
