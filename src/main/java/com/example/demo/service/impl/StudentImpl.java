package com.example.demo.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentDettails;
import com.example.demo.service.StudentService;
import com.example.demo.service.util.GenricResponse;

@Service
public class StudentImpl implements StudentService {

	@Override
	public ResponseEntity<?> getStudentDetails() {
		// TODO Auto-generated method stub
		
		StudentDettails studentDettails = new StudentDettails();
		
		studentDettails.setId(1);
		studentDettails.setName("Chirag Soni");
		studentDettails.setAddress("Palanpur");
		studentDettails.setMobileNumber("7486821097");
		studentDettails.setBranch("Computer");
		return ResponseEntity.ok(new GenricResponse(201, "success", studentDettails));
	}

}
