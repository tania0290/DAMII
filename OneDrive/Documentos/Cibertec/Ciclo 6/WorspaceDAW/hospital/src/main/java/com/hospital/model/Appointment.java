package com.hospital.model;


import java.sql.Time;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Table (name="appointment")
public class Appointment {
	

	
	@ManyToOne
	@JoinColumn(name="patient_id", referencedColumnName ="patientId" )
	private Patient patient;
	
	@ManyToOne
	@JoinColumn(name="doctor_id", referencedColumnName ="doctorId" )
	private Doctor doctor;
	
	private LocalDate Date;
	private Time time;
	
}
