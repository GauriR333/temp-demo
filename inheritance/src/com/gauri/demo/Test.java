package com.gauri.demo;

public class Test {
	public static void main(String[] args) {

		Employee e1 = new Employee(101, "gauri", "pune", 1236547);

		System.out.println("Empoyee Information: " + "Id: " + e1.employeeId + "  Name:" + e1.name + "  Address:"
				+ e1.address + "  phoneNumber:" + e1.phoneNumber);

		Developer d1 = new Developer();
		d1.skill = "java";
		d1.address = "Mumbai";
		System.out.println("Developer information: " + d1.toString());

		Developer d2 = new Developer();
		d2.employeeId = 1001;
		d2.name = "santosh";
		d2.address = "Aahamadnagar";
		d2.phoneNumber = 15263;
		System.out.println("Developer informatin : " + d2.employeeId + " name: " + d2.name + " address:" + d2.address
				+ " phone Number:" + d2.phoneNumber);
		
		Maneger m1= new Maneger(1003,"santosh","namgar",1233,1345);
		System.out.println("Maneger Information: " + "Id: " + m1.employeeId + "  Name:" + m1.name + "  Address:"
				+ m1.address + "  phoneNumber:" + m1.phoneNumber+" incentive:"+m1.insentive);

	}
	
	

}
