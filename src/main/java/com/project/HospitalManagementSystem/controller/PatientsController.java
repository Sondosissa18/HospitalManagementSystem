package com.project.HospitalManagementSystem.controller;


import com.project.HospitalManagementSystem.model.Patient;
import com.project.HospitalManagementSystem.repository.PatientsRepository;
import com.project.HospitalManagementSystem.service.NurseService;
import com.project.HospitalManagementSystem.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        Patient patient =new Patient();
        model.addAttribute("patient", patient);
        return "addPatient";
    }

    @GetMapping("/showPatientData/{id}")
    public String showDetails(@PathVariable(value = "id") Long id, Model model) {
        Patient patient = patientsService.getPatientsById(id);
        model.addAttribute("patient", patient);
        return "view";
    }

//    @GetMapping("/assignNurseForm/{id}")
//    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model){
//        Patient patients  = patientsService.getPatientsById(id);
//        model.addAttribute("patient",patients);
//        return "assignNurse";
//
//    }




    //save
    @PostMapping("/savePatients")
    public String savePatients(@ModelAttribute("patient") Patient patient){
        patientsService.addPatients(patient);
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
