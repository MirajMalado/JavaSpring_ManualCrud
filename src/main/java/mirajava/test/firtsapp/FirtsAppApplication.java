package mirajava.test.firtsapp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mirajava.test.firtsapp.Repositories.PatientRepository;
import mirajava.test.firtsapp.entities.Patients;

@SpringBootApplication
public class FirtsAppApplication implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FirtsAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patients(null, "Miraj", new Date(), 2300,false ));
		patientRepository.save(new Patients(null, "Mounirou", new Date(), 500,false ));
		patientRepository.save(new Patients(null, "Issaga", new Date(), 2500,false ));
		patientRepository.save(new Patients(null, "AichaMounir", new Date(), 1500,false ));
		
	}

}
