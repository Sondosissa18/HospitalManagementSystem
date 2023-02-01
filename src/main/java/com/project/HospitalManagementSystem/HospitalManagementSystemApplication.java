package com.project.HospitalManagementSystem;

import com.project.HospitalManagementSystem.model.Nurse;
import com.project.HospitalManagementSystem.model.Patient;
import com.project.HospitalManagementSystem.repository.NurseRepository;
import com.project.HospitalManagementSystem.repository.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalManagementSystemApplication  implements CommandLineRunner {

	@Autowired
	private PatientsRepository patientsRepository;
	@Autowired
	private NurseRepository nurseRepository;

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Patient patient = new Patient();
		patient.setName("sondos");
		patient.setEmail("sondos@gmail.com");
		patient.setPhoneNumber("134567898");
		patient.setRelation("mother");
		patientsRepository.save(patient);

		Nurse nurse = new Nurse();
		nurse.setName("sondos");
		nurseRepository.save(nurse);

		Nurse nurse1 = new Nurse();
		nurse1.setName("issa");
		nurseRepository.save(nurse1);
	}
}
