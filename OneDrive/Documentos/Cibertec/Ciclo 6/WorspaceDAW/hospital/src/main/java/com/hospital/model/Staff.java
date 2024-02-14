package com.hospital.model;

import java.time.LocalDate;

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
@Table (name="staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int staffNum;
	private String firstName;
	private String lastName;
	private String adress;
	private String phone;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;

}
