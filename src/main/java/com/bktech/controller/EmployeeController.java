package com.bktech.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@GetMapping("/msg")
	public ResponseEntity<String> getMsg(){
		return ResponseEntity.ok("Welcome To GIT Project");
	}
	
	@GetMapping("/msg1")
	public ResponseEntity<String> getMsg1(){
		return ResponseEntity.ok("Welcome To GIT Project");
	}
}
