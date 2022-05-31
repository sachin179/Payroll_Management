package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Medicine;
import com.example.demo.model.Test;
import com.example.demo.repository.TestReository;

@Service
@Transactional
public class TestService {
	
	private final TestReository testReository;

	public TestService(TestReository testReository) {
		this.testReository = testReository;
	}
	public void saveMytest(Test test) {
		if(test != null) {
		testReository.save(test);}else {
			System.out.println("null");
		}
	}
	
	public List<Test> showAllTest(){
		List<Test> tests = new ArrayList<Test>();
		for(Test test:testReository.findAll()) {
			tests.add(test);
		}
		return tests;
	}
	public void deletemytest(int id) {
		testReository.deleteById(id);
	}
	
	public Test edittest(String rbc) {
		return testReository.findByrbc(rbc);
		
		}
	
	
	public Test findBywbc(String wbc) {
		return testReository.findBywbc(wbc);
	}
}
