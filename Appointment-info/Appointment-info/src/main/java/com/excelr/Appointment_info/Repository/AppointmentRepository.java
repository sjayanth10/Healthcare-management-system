package com.excelr.Appointment_info.Repository;

import com.excelr.Appointment_info.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    Appointment findByIdPatientId(long patientId);
}