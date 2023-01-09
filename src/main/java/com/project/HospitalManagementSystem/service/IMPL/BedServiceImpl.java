package com.project.HospitalManagementSystem.service.IMPL;


import com.project.HospitalManagementSystem.model.Beds;
import com.project.HospitalManagementSystem.repository.AmbulanceRepository;
import com.project.HospitalManagementSystem.repository.BedsRepository;
import com.project.HospitalManagementSystem.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BedServiceImpl implements BedService {

    @Autowired
    private BedsRepository bedsRepository;


    @Override
    public List<Beds> allBedsList() {

        return bedsRepository.findAll();
    }

    @Override
    public void addBeds(Beds beds) {
        bedsRepository.save(beds);

    }

    @Override
    public Beds updateBedsInfo(Long id, Beds beds) {
        Beds updatedBeds= bedsRepository.findById(id).orElseThrow(()->
                new RuntimeException("Bed Not Found With This Id: "+id)
        );
        updatedBeds.setNumber(beds.getNumber());
        bedsRepository.save(updatedBeds);
        return beds;
    }

    @Override
    public void deleteBeds(Long id) {
        bedsRepository.deleteById(id);
    }
}
