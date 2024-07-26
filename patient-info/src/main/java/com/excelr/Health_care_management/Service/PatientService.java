package com.excelr.Health_care_management.Service;

import com.excelr.Health_care_management.Entity.Patient;
import com.excelr.Health_care_management.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repo;

    public Patient addpatients(Patient patient) {
        return repo.save(patient);
    }

    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    public List<Patient> getPatientsByPatientId(long pateintId) {
        return repo.findByPatientId(pateintId);
    }
}
