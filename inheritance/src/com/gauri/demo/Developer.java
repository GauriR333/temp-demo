package com.gauri.demo;

public class Developer extends Employee {
	
	String skill;

	@Override
	public String toString() {
		return "Developer [skill=" + skill + ", employeeId=" + employeeId + ", name=" + name + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
