package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Medicine;
import com.example.demo.model.User;
import com.example.demo.repository.MedicineRepository;

@Service
@Transactional
public class MedicineService {

	private final MedicineRepository medicineRepository;
	
	public MedicineService(MedicineRepository medicineRepository) {
		this.medicineRepository = medicineRepository;
	}
	public void saveMymedicine(Medicine medicine) {
		
		medicineRepository.save(medicine);
	}
	
	public List<Medicine> showAllmedicine(){
		List<Medicine> medicines = new ArrayList<Medicine>();
		for(Medicine medicine:medicineRepository.findAll()) {
			medicines.add(medicine);
		}
		return medicines;
	}
	
	public void deletemyPatient(int id) {
		medicineRepository.deleteById(id);
	}
	
	public Medicine editPatient(String username) {
		return medicineRepository.findByUsername(username);
		
		}
	
	
	public Medicine findByphone(String phone) {
		return medicineRepository.findByphone(phone);
	}
	

	
}
