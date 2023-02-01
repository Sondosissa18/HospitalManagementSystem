package com.project.HospitalManagementSystem.model;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Patients_id")
    private Long id;

    private String name;

    private String email;

    private String relation;

    private String phoneNumber;


}
