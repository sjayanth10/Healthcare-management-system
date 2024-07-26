package com.excelr.Appointment_info.Client;

import com.excelr.Appointment_info.Entity.Appointment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Patient-info", url = "http://localhost:9090/users")
public interface UserClient {
    @GetMapping("patient/{patientId}")
    List<Appointment> findByPatientId(@PathVariable("patientId") long PatientId);
}