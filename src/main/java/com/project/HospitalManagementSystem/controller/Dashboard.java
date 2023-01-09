package com.project.HospitalManagementSystem.controller;

import com.project.HospitalManagementSystem.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Dashboard {


    private final DoctorsRepository doctorsRepository;
    private  final PatientsRepository patientsRepository;
    private  final NurseRepository nurseRepository;
    private final ComplainRepository complainRepository;

    private final BedsRepository bedsRepository;

    public Dashboard(DoctorsRepository doctorsRepository, PatientsRepository patientsRepository, NurseRepository nurseRepository, ComplainRepository complainRepository, BedsRepository bedsRepository) {
        this.doctorsRepository = doctorsRepository;
        this.patientsRepository = patientsRepository;
        this.nurseRepository = nurseRepository;
        this.complainRepository = complainRepository;
        this.bedsRepository = bedsRepository;
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("countDoctors", doctorsRepository.countDoctors());
        model.addAttribute("countPatient", patientsRepository.countPatient());
        model.addAttribute("countNurse", nurseRepository.countNurse());
        model.addAttribute("countComplain" , complainRepository.countComplain());
        model.addAttribute("countBeds" , bedsRepository.countBeds());
        return "dashboard";

    }

}
