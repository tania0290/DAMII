package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.model.Pharmacy;

public interface PharmacyRepo extends JpaRepository<Pharmacy, Integer>{

}
