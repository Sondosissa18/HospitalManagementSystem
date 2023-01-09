package com.project.HospitalManagementSystem.controller;


import com.project.HospitalManagementSystem.model.Doctors;
import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.repository.NurseRepository;
import com.project.HospitalManagementSystem.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class NurseController {


    @Autowired
    private NurseRepository nurseRepository;

    @Autowired
    private NurseService nurseService;


    @GetMapping("/allNurseList")
    public String viewHomePage(Model model) {
        model.addAttribute("listNurse", nurseService.allNurse());
        return "listOfNurse";
    }

    @GetMapping("/addNurse")
    public String addNurse(Model model) {
        Nurse nurse = new Nurse();
        model.addAttribute("nurse", nurse);
        return "addNurse";
    }

    @PostMapping("/saveNurse")
    public String saveNurse(@ModelAttribute("nurse") Nurse nurse){
        nurseService.addNurse(nurse);
        return "redirect:/";
    }



}
