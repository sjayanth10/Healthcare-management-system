package com.excelr.Appointment_info.Service;

import com.excelr.Appointment_info.Client.UserClient;
import com.excelr.Appointment_info.Config.Fullresponse;
import com.excelr.Appointment_info.Entity.Appointment;
import com.excelr.Appointment_info.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private static AppointmentRepository repo;
    @Autowired
    private UserClient client;

    public static List<Appointment> getAllappointments() {
        return repo.findAll();
    }

    public Appointment addAppointment(Appointment appointment) {
        return repo.save((appointment));
    }

    public Fullresponse getAppointmentWithPatientId(long patientId) {
        Appointment appointment = repo.findByIdPatientId(patientId);
        List<Appointment> users= client.findByPatientId(patientId);
        Fullresponse fullresponse=new Fullresponse();
        fullresponse.setPatientId(appointment.getPatientId());;
        fullresponse.setDoctorName(appointment.getDoctorName());
        fullresponse.setId(appointment.getId());
        fullresponse.setAppointmentDateTime(appointment.getAppointmentDateTime());
        return fullresponse;
    }
}