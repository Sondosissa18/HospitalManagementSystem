package com.project.HospitalManagementSystem.service;


import com.project.HospitalManagementSystem.model.Complain;

import java.util.List;

public interface ComplainService {

    List<Complain> allComplain();

    void addComplain(Complain complain);

    Complain updateComplainInfo(Long id, Complain complain);

    void deleteComplain(Long id);

    Complain getComplainById(Long id);

}
