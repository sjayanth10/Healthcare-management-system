package com.excelr.Appointment_info.Controller;

import com.excelr.Appointment_info.Config.Fullresponse;
import com.excelr.Appointment_info.Entity.Appointment;
import com.excelr.Appointment_info.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/addappointment")
    @ResponseStatus(HttpStatus.CREATED)
    public Appointment addappointment(@RequestBody Appointment appointment){
        return appointmentService.addAppointment(appointment);
    }
    @GetMapping("/getappointment")
    public List<Appointment> getallappointment(){
        return appointmentService.getAllappointments();
    }
    @GetMapping("with-patient/{patientId}")
    public ResponseEntity<Fullresponse> getAppointmentWithPatientId(@PathVariable("patientId") long patientId){
        return ResponseEntity.ok(appointmentService.getAppointmentWithPatientId(patientId));
    }

}
