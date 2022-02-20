package com.data.distribution.patients.model;

import java.io.Serializable;

public class Patient implements Serializable {

	String id;
	String name;
	int age;
	String phoneNumber;
	//	 int is 32 bits in width while long is 64 bits in width

	public Patient(String id, String name, int age, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	// getters and setters for json creation
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
