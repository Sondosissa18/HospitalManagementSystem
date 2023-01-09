package com.project.HospitalManagementSystem.service.IMPL;


import com.project.HospitalManagementSystem.model.Doctors;
import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.repository.DoctorsRepository;
import com.project.HospitalManagementSystem.service.DoctorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorsServiceImpl implements DoctorsService {

    @Autowired
    private DoctorsRepository doctorsRepository;


    @Override
    public List<Doctors> allDoctors() {
        return doctorsRepository.findAll();
    }

    @Override
    public void addDoctors(Doctors doctors) {
        doctorsRepository.save(doctors);

    }

    @Override
    public Doctors updateDoctorsInfo(Long id, Doctors doctors) {
        Doctors updatedDoctor= doctorsRepository.findById(id).orElseThrow(()->
                new RuntimeException("Doctor Not Found With This Id: "+id)
        );
        updatedDoctor.setName(doctors.getName());
        updatedDoctor.setDocNum(doctors.getDocNum());
        updatedDoctor.setSalary(doctors.getSalary());
        updatedDoctor.setDepartment(doctors.getDepartment());
        doctorsRepository.save(updatedDoctor);
        return doctors;
    }

    @Override
    public void deleteDoctors(Long id) {
        doctorsRepository.deleteById(id);
    }

    @Override
    public Doctors getDoctorsById(Long id) {
        Optional<Doctors> optional = doctorsRepository.findById(id);
        Doctors doctors = null;
        if (optional.isPresent()) {
            doctors = optional.get();
        } else {
            throw new RuntimeException("Doctors Not found with this id::" + id);
        }
        return doctors;
    }
}
