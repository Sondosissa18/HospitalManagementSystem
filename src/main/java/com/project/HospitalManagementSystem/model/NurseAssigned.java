package com.project.HospitalManagementSystem.model;

import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.model.Patient;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "nurseAssign")
public class NurseAssigned {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String patientName;
    private String nurseName;

}
