package com.project.HospitalManagementSystem.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "beds")
public class Beds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "beds_id")
    private Long id;
    private String number;


    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "Patients_id")
    @JsonBackReference
    private Patients patients;


}

