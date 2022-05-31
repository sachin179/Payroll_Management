package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Medicine;


public interface MedicineRepository extends CrudRepository<Medicine , Integer> {
	

//	public Medicine findByUsernameAndnic(String username, String nic);
	public Medicine findByUsername(String username);
	public Medicine findByphone(String phone);
//	public Medicine deleteById(String id);


}
