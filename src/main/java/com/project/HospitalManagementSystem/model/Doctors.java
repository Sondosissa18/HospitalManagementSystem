package com.project.HospitalManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "doctors")
public class Doctors {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctors_id")
    private Long id;

    private String name;

    private String docNum;

    private String department;

    private Double salary;


//    //@ManyToMany : And Many patients have many doctors.
//    @ManyToMany(mappedBy = "doctors", fetch = FetchType.LAZY)
//    @JsonBackReference
//    private Set<Patients> patients;



}


/*
@OneToOne each Patient have one  Nurse . One patient have one Bed. In progrss....

@ManyToMany : And Many patients have many doctors.

@OnetoMany : one ambulance have many patience. In progrss....

///get the action delete, view  and update button

.....


 */
