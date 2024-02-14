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
@Table (name="invoice")
public class Invoice {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int invoiceNum;
	private String serviceDescription;
	private Double cost;
	private Double total;
	
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;

}
