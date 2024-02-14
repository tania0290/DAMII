package com.hospital.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Pharmacy;
import com.hospital.repo.PharmacyRepo;
import com.hospital.service.PharmacyService;

@Service
public class PharmacyServiceImpl implements PharmacyService {

	@Autowired
	PharmacyRepo pharmacyRepo;
	
	@Override
	public List<Pharmacy> list() {
		// TODO Auto-generated method stub
		return pharmacyRepo.findAll();
	}

	@Override
	public Pharmacy add(Pharmacy f) {
		// TODO Auto-generated method stub
		return pharmacyRepo.save(f);
	}

	@Override
	public Pharmacy update(Pharmacy f) {
		// TODO Auto-generated method stub
		return pharmacyRepo.save(f);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pharmacyRepo.deleteById(id);
	}

}
