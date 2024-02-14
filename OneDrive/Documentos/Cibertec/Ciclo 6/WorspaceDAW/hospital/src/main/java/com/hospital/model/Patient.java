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
@Table (name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int patientId;
	private String patientFName;
	private String patientLName;
	private String address;
	private String phone;
	
	@ManyToOne
	@JoinColumn(name="pharmacy_id")
	private Pharmacy pharmacy;
	
	@OneToOne(mappedBy = "patient")
	private Room room;

}
