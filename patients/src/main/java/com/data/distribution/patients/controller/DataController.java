package com.data.distribution.patients.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DataController {

	@Autowired
	private Environment environment;

	@Value("${spring.application.name}")
	private String appName;

	@GetMapping("/data")
	public String checkStatus() {
		return "Checking status ...... " + " " + appName + " running on port " +
				environment.getProperty("local.server.port");
	}
}
