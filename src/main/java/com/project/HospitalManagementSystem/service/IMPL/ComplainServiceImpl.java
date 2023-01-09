package com.project.HospitalManagementSystem.service.IMPL;


import com.project.HospitalManagementSystem.model.Complain;
import com.project.HospitalManagementSystem.model.Doctors;
import com.project.HospitalManagementSystem.repository.BedsRepository;
import com.project.HospitalManagementSystem.repository.ComplainRepository;
import com.project.HospitalManagementSystem.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplainServiceImpl implements ComplainService {

    @Autowired
    private ComplainRepository complainRepository;


    @Override
    public List<Complain> allComplain() {
        return complainRepository.findAll();
    }

    @Override
    public void addComplain(Complain complain) {
         complainRepository.save(complain);
    }

    @Override
    public Complain updateComplainInfo(Long id, Complain complain) {
        Complain updatedComplain= complainRepository.findById(id).orElseThrow(()->
                new RuntimeException("Complain Not Found With This Id: "+id)
        );
        updatedComplain.setName(complain.getName());
        updatedComplain.setBranch(complain.getBranch());
        updatedComplain.setContactNumber(complain.getContactNumber());
        updatedComplain.setFullComplain(complain.getFullComplain());
        complainRepository.save(updatedComplain);
        return complain;

    }
    @Override
    public void deleteComplain(Long id) {
        complainRepository.deleteById(id);

    }

    @Override
    public Complain getComplainById(Long id) {
        return null;
    }
}
