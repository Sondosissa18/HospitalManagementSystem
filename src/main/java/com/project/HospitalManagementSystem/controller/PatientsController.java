package com.project.HospitalManagementSystem.controller;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.project.HospitalManagementSystem.model.Complain;
import com.project.HospitalManagementSystem.model.Doctors;
import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.model.Patients;
import com.project.HospitalManagementSystem.repository.PatientsRepository;
import com.project.HospitalManagementSystem.service.ComplainService;
import com.project.HospitalManagementSystem.service.NurseService;
import com.project.HospitalManagementSystem.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import java.util.List;

@Controller
public class PatientsController {

    @Autowired
    private PatientsService patientsService;

    @Autowired
    private  PatientsRepository patientsRepository;

    @Autowired
    private NurseService nurseService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listPatients", patientsService.allPatients());
        return "index";
    }

    @GetMapping("/allPatients")
    public String listOfPatients(Model model){
        model.addAttribute("listPatients", patientsService.allPatients());
        return "listOfPatients";
    }

    @GetMapping("/addPatients")
    public String addPatients(Model model){
        Patients patients =new Patients();
        model.addAttribute("patient", patients);
        return "addPatient";
    }

    @GetMapping("/showPatientData/{id}")
    public String showDetails(@PathVariable(value = "id") Long id, Model model) {
        Patients patients = patientsService.getPatientsById(id);
        model.addAttribute("patients", patients);
        return "view";
    }

    @GetMapping("/assignNurseForm/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model){
        Patients patients  = patientsService.getPatientsById(id);
        model.addAttribute("patient",patients);
        return "assignNurse";

    }




    //save
    @PostMapping("/savePatients")
    public String savePatients(@ModelAttribute("patient") Patients patients){
        patientsService.addPatients(patients);
        return "redirect:/";
    }

    //save
    // find by id

    @GetMapping("/deletePatient/{id}")
    private String deletePatient(@PathVariable Long id){
        patientsService.deletePatients(id);
        return "redirect:/";
    }





}
