package com.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="hospital")
public class Hospital {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int hospitalId;
	private String hospitalName;
	private String hospitalAdress;
	private String hospitalPhone;
	private String hospitalState;
	private String hospitalZipCode;

}
