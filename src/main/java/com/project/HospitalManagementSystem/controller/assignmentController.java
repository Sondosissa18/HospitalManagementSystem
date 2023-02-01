//package com.project.HospitalManagementSystem.controller;
//
//import com.project.HospitalManagementSystem.model.Nurse;
//import com.project.HospitalManagementSystem.model.Patients;
//import com.project.HospitalManagementSystem.repository.NurseRepository;
//import com.project.HospitalManagementSystem.repository.PatientsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
//@Controller
//public class assignmentController {
//
//    @Autowired
//    private PatientsRepository patientsRepository;
//
//    @Autowired
//    private NurseRepository nurseRepository;
//
//    @GetMapping("/assignments")
//    public  String getAssignments(Model model){
//
//        model.addAttribute("listOfNurse", nurseRepository.findAll());
//        return "assignments";
//    }
//
////    @RequestMapping(value = "/assignments",method = RequestMethod.POST)
////    public String  addNurseToPatient(@RequestParam Long patientId, @RequestParam Long nurseId){
////        Patients patients = patientsRepository.findById(patientId).orElse(null);
////        Nurse nurse = nurseRepository.findById(nurseId).orElse(null);
////        patients.setNurse(nurse);
////        nurse.setPatients(patients);
////        patientsRepository.save(patients);
////        nurseRepository.save(nurse);
////        return "redirect:/assignNurse";
////    }
//
//}
