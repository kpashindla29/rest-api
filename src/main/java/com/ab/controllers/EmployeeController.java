package com.ab.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ab.models.Employee;

@RestController
public class EmployeeController {
	
	
	@GetMapping("/")
	public String greeting() {
		return "Welcome to REST API !!!!!!!!!!!!!";
	}
	
	@GetMapping("/hi")
	public String hi() {
		return "Hi there!!!!";
	}
	
	
//	@PostMapping("/employee")
//	public ResponseEntity<Object> createEmployee(@RequestBody Employee e) {
//		
//		System.out.println(e);
//		
//		return new ResponseEntity<>(e,HttpStatus.OK);
//	}

}
