package com.hospital.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Prescription;
import com.hospital.projections.ReportPrescription;
import com.hospital.repo.PrescriptionRepo;
import com.hospital.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService{

	@Autowired
	PrescriptionRepo prescriptionRepo;
	
	
	@Override
	public List<Prescription> list() {
		// TODO Auto-generated method stub
		return prescriptionRepo.findAll();
	}

	@Override
	public Prescription add(Prescription r) {
		// TODO Auto-generated method stub
		return prescriptionRepo.save(r);
	}

	@Override
	public Prescription update(Prescription r) {
		// TODO Auto-generated method stub
		return prescriptionRepo.save(r);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		prescriptionRepo.deleteById(id);
	}

	/*
	 * @Override public List<ReportPrescription> getReportPrescription() {
	 * List<ReportPrescription> list = prescriptionRepo.getReportPrescription();
	 * return list; }
	 */
	

}
