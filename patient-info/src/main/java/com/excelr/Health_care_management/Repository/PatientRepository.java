package com.excelr.Health_care_management.Repository;

import com.excelr.Health_care_management.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByPatientId(long pateintId);
}
