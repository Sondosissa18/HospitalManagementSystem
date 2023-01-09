package com.project.HospitalManagementSystem.service.IMPL;


import com.project.HospitalManagementSystem.model.Ambulance;
import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.repository.AmbulanceRepository;
import com.project.HospitalManagementSystem.service.AmbulanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AmbulanceServiceImpl implements AmbulanceService {

    @Autowired
    private AmbulanceRepository ambulanceRepository;

    @Override
    public List<Ambulance> allComplain() {

        return ambulanceRepository.findAll();
    }

    @Override
    public void addComplain(Ambulance ambulance) {
        ambulanceRepository.save(ambulance);
    }

    @Override
    public Ambulance updateAmbulanceInfo(Long id, Ambulance ambulance) {
        Ambulance updatedAmbulance = ambulanceRepository.findById(id).orElseThrow(()->
                new RuntimeException("Employee Not Found With This Id: "+id)
        );
        updatedAmbulance.setBrand(ambulance.getBrand());
        updatedAmbulance.setColor(ambulance.getColor());
        updatedAmbulance.setRegistrationNumber(ambulance.getRegistrationNumber());
        ambulanceRepository.save(updatedAmbulance);
        return ambulance;
    }

    @Override
    public void deleteComplain(Long id) {
        ambulanceRepository.deleteById(id);
    }

    @Override
    public Ambulance getAmbulanceById(Long id) {

        Optional<Ambulance> optional =ambulanceRepository.findById(id);
        Ambulance ambulance =null;
        if (optional.isPresent()){
            ambulance=optional.get();
        }else {
            throw new RuntimeException("Ambulance Not found with this id::" +id);
        }
        return ambulance;

    }
}
