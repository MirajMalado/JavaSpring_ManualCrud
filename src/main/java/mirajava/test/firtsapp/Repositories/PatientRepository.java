package mirajava.test.firtsapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mirajava.test.firtsapp.entities.Patients;

public interface PatientRepository extends JpaRepository<Patients, Long> {

}
