package com.project.HospitalManagementSystem.controller;

import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.model.NurseAssigned;
import com.project.HospitalManagementSystem.model.Patient;
import com.project.HospitalManagementSystem.repository.NurseRepository;
import com.project.HospitalManagementSystem.repository.PatientsRepository;
import com.project.HospitalManagementSystem.service.NurseAssignService;
import com.project.HospitalManagementSystem.service.NurseService;
import com.project.HospitalManagementSystem.service.PatientsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@Controller
public class assignmentController {

    @Autowired
    private PatientsService patientsService;

    @Autowired
    private NurseService nurseService;
    @Autowired
    private NurseAssignService nurseAssignService;

    @GetMapping("/showFormForAssign")
    public  String getAssignments(Model model){
        model.addAttribute("listOfPatients",patientsService.allPatients());
        model.addAttribute("listOfNurse", nurseService.allNurse());
        return "assignNurseForm";
    }



    @RequestMapping(value = "/assignments/{patient}/{nurse}",method = RequestMethod.POST)
    public String  addNurseToPatient(@PathVariable String patient, @PathVariable String nurse,Model model){
        nurseAssignService.nurseAssign(patient,nurse);
        return "redirect:/";
    }

}
