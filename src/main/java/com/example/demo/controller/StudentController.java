package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/abc")
	public String abc() {
		return "Hello";
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getStudent(){
		return studentService.getStudentDetails();
		 
	}

}
