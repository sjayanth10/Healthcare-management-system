package com.excelr.Appointment_info.Config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Fullresponse {

    private long id;
    private long patientId;
    private String doctorName;
    private LocalDateTime appointmentDateTime;
    public List<Patient> patients;
}
