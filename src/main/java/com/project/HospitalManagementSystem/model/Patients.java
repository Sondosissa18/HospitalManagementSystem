package com.project.HospitalManagementSystem.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "patients")
public class Patients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Patients_id")
    private Long id;

    private String name;

    private String email;

    private String relation;

    private String phoneNumber;


    // one to one: one patient have one Nurse . in progress
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)

    @JsonManagedReference
    private Nurse nurse;

//    private Beds beds;


    //many to one:  Many patience have one ambulance
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ambulance_id")
    @JsonBackReference
    private Ambulance ambulance;


   // @ManyToMany : And Many patients have many doctors.
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
/// We created a new table inside database and join 2 columns : first coulumn is doctorid and second is patient id
    @JoinTable(name = "patient_doctor",joinColumns ={
            @JoinColumn(name = "Patients_id", referencedColumnName = "Patients_id")},
            inverseJoinColumns ={@JoinColumn(name = "doctors_id",referencedColumnName = "doctors_id")})
    private Set<Doctors> doctors;







}
