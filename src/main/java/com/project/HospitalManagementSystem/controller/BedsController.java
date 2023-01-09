package com.project.HospitalManagementSystem.controller;


import com.project.HospitalManagementSystem.model.Beds;
import com.project.HospitalManagementSystem.model.Doctors;
import com.project.HospitalManagementSystem.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BedsController {

     @Autowired
    private BedService bedService;


    @GetMapping("/allBedsList")
    public String viewHomePage(Model model) {
        model.addAttribute("listBeds",  bedService.allBedsList());
        return "index";
    }

    @GetMapping("/addBeds")
    public String addBeds(Model model) {
        Beds beds = new Beds();
        model.addAttribute("beds", beds);
        return "addBeds";
    }

    @PostMapping("/saveBeds")
    public String saveBeds(@ModelAttribute("beds") Beds beds){
        bedService.addBeds(beds);
        return "redirect:/";
    }
}
