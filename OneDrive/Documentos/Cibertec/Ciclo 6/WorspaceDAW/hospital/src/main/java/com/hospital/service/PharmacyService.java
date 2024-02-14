package com.hospital.service;

import java.util.List;


import com.hospital.model.Pharmacy;

public interface PharmacyService {
	
	public List<Pharmacy> list();
	public Pharmacy add(Pharmacy f);
	public Pharmacy update(Pharmacy f);
	public void delete(int id);
}
