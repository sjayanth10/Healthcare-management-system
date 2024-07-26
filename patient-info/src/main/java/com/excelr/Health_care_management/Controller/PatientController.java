package com.excelr.Health_care_management.Controller;


import com.excelr.Health_care_management.Entity.Patient;
import com.excelr.Health_care_management.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/addpatients")
    public Patient addpatients(@RequestBody Patient patient){
        return patientService.addpatients(patient);
    }

    @GetMapping("/patients")
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @GetMapping("patient/{patientId}")
    public ResponseEntity<List<Patient>> getpatientsByPatientId(@PathVariable("patientId")long patientId){
        List<Patient> patients = patientService.getPatientsByPatientId(patientId);
        if(patients.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(patients);
    }


}