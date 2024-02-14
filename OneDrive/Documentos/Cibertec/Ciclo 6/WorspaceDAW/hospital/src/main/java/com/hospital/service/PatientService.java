package com.hospital.service;

import java.util.List;

import com.hospital.model.Patient;


public interface PatientService {
	
	public List<Patient> list();
	public Patient add(Patient p);
	public Patient update(Patient p);
	public void delete(int id);

}
