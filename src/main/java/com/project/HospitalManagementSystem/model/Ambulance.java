package com.project.HospitalManagementSystem.model;

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
@Table(name = "ambulance")
public class Ambulance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "ambulance_id")

    private Long id;

    private String brand;

    private String color;
    private String registrationNumber;


//    //one ambulance have many patience
//    @OneToMany(mappedBy ="ambulance", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JsonManagedReference
//    private Set<Patients> patients;


}
