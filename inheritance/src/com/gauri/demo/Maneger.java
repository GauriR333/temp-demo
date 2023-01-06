package com.gauri.demo;

public class Maneger extends Employee {

	int insentive;

	Maneger() {

	}

	Maneger(int employeeId, String name, String address, double phoneNumber, int insentive) {
		this.employeeId = employeeId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.insentive = insentive;
	}
}
