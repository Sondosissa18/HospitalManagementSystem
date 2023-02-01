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
@Table(name = "nurse")
public class Nurse {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nurse_id")
    private Long id;

    private String name;

//
//    @OneToOne(mappedBy = "nurse", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "Patients_id")
//    @JsonBackReference
//    private Patients patients;


}
