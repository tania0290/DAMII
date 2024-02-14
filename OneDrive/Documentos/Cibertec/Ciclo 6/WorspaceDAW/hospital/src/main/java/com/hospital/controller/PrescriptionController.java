package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hospital.model.Prescription;
import com.hospital.projections.ReportPrescription;
import com.hospital.service.PrescriptionService;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

	
	@Autowired
	PrescriptionService prescriptionService;

	@GetMapping 
	public ResponseEntity<List<Prescription>> list(){
		return  new ResponseEntity<>(prescriptionService.list(), HttpStatus.OK)  ;
	}
	

	/*
	 * @GetMapping ("/report-patient-prescription") public
	 * ResponseEntity<List<ReportPrescription>> getReportInterface(){ return new
	 * ResponseEntity<>(prescriptionService.getReportPrescription(), HttpStatus.OK)
	 * ; }
	 */
	
	
	@PostMapping
	public ResponseEntity<Prescription> add(@RequestBody Prescription r) {
		return new ResponseEntity<>(prescriptionService.add(r), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Prescription> update(@RequestBody Prescription r) {
		return new ResponseEntity<>(prescriptionService.update(r), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		prescriptionService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
