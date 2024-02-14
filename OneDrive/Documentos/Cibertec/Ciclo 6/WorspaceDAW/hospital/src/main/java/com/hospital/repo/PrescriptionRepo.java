package com.hospital.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hospital.model.Prescription;
import com.hospital.projections.ReportPrescription;

public interface PrescriptionRepo extends JpaRepository<Prescription, Integer>{
	/*
	 * @Query("SELECT " + "patientId, " + "patientFName, " + "patientLName, " +
	 * "FROM Patient ") public List<ReportPrescription> getReportPrescription();
	 */

}


