package com.hospital.service;

import java.util.List;

import com.hospital.model.Prescription;
import com.hospital.projections.ReportPrescription;

public interface PrescriptionService {
	
	public List<Prescription> list();

	/* public List<ReportPrescription> getReportPrescription(); */
	public Prescription add(Prescription r);
	public Prescription update(Prescription r);
	public void delete(int id);
}
