package com.hospital.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Patient;
import com.hospital.repo.PatientRepo;
import com.hospital.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepo patientRepo;
	
	@Override
	public List<Patient> list() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}

	@Override
	public Patient add(Patient p) {
		// TODO Auto-generated method stub
		return patientRepo.save(p);
	}

	@Override
	public Patient update(Patient p) {
		// TODO Auto-generated method stub
		return patientRepo.save(p);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		patientRepo.deleteById(id);
	}

}
