package com.hospital.model;

import java.sql.Time;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="department")
public class Department {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int departmentId;
	private String departmentName;
	
	@ManyToOne
	@JoinColumn(name="hospital_id")
	private Hospital hospital;
}
