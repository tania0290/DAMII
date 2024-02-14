package com.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int doctorId;
	private String doctorFname;
	private String doctorLname;
	private String phoneNumber;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	

}
