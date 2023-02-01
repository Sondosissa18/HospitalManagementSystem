package com.project.HospitalManagementSystem;

import com.project.HospitalManagementSystem.model.Patients;
import com.project.HospitalManagementSystem.repository.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalManagementSystemApplication  implements CommandLineRunner {

	@Autowired
	private PatientsRepository patientsRepository;

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Patients patients = new Patients();
		patients.setName("sondos");
		patients.setEmail("sondos@gmail.com");
		patients.setPhoneNumber("134567898");
		patients.setRelation("mother");
		patientsRepository.save(patients);
	}
}
