package com.project.HospitalManagementSystem.controller;

import com.project.HospitalManagementSystem.model.Complain;
import com.project.HospitalManagementSystem.model.Doctors;
import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.repository.ComplainRepository;
import com.project.HospitalManagementSystem.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ComplainFormController {


    @Autowired
    private ComplainService complainService;

    @Autowired
    private ComplainRepository complainRepository;


    @GetMapping("/allComplainList")
    public String viewHomePage(Model model) {
        model.addAttribute("listComplains", complainService.allComplain());
        return "listOfComplains";
    }


    @GetMapping("/complainform")
    private String addComplian(Model model){
        Complain complain = new Complain();
        model.addAttribute("complain", complain);
        return "complainForm";
    }


    @PostMapping("/saveComplain")
    public String saveComplain(@ModelAttribute("complain") Complain complain){
        complainService.addComplain(complain);
        return "redirect:/";
    }

//    @GetMapping("/showComplainData/{id}")
//    public String showDetails(@PathVariable(value = "id") Long id, Model model) {
//        Complain complain = complainService.getComplainById(id);
//        model.addAttribute("complain", complain);
//        return "view";
//    }


    @GetMapping("/deleteComplain/{id}")
    private String deleteComplain(@PathVariable(value = "id") Long id){
        complainService.deleteComplain(id);
        return "redirect:/";
    }






}
