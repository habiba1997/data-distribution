package com.data.distribution.patients.controller;

import com.data.distribution.patients.model.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientUserController {

	@GetMapping("/user")
	public Patient getUserBYId(@RequestParam(value = "id") String id) {
		return new Patient(id, "Data Distribution Course", 20, "01151280909");
	}
}
