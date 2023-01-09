package com.project.HospitalManagementSystem.controller;

import com.project.HospitalManagementSystem.model.Doctors;
import com.project.HospitalManagementSystem.model.Patients;
import com.project.HospitalManagementSystem.repository.DoctorsRepository;
import com.project.HospitalManagementSystem.service.DoctorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DoctorsController {

    @Autowired
    private DoctorsService doctorsService;

    @Autowired
    private DoctorsRepository doctorsRepository;

    @GetMapping("/allDoctorsList")
    public String viewHomePage(Model model) {
        model.addAttribute("listDoctors", doctorsService.allDoctors());
        return "listOfDoctors";
    }

    @GetMapping("/addDoctor")
    public String addDoctors(Model model) {
        Doctors doctors = new Doctors();
        model.addAttribute("doctors", doctors);
        return "addDoctor";
    }

    @PostMapping("/saveDoctors")
    public String saveDoctors(@ModelAttribute("doctors") Doctors doctors){
        doctorsService.addDoctors(doctors) ;
        return "redirect:allDoctorsList";
    }

    @GetMapping("/showDoctorData/{id}")
    public String showDetails(@PathVariable(value = "id") Long id, Model model) {
        Doctors doctors= doctorsService.getDoctorsById(id);
        model.addAttribute("doctors", doctors);
        return "view";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model){
        Doctors doctors= doctorsService.getDoctorsById(id);
        model.addAttribute("doctors", doctors);
        return "update_doctor";

    }


    @GetMapping("/deleteDoctor/{id}")
    private String deleteDoctors(@PathVariable Long id){
        doctorsService.deleteDoctors(id);
        return "redirect:/";
    }



}
