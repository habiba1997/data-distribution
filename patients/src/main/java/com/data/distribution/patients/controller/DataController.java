package com.data.distribution.patients.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	@Autowired
	private Environment environment;

	@GetMapping("/data")
	public String getData() {
		return environment.getProperty("data.key.value");
	}
}
