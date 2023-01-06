package com.gauri.demo;

public class Function_O {
	public static void main(String[] args) {

		Function_O app = new Function_O();
		Function_O app1 = new Function_O();
		Function_O app2 = new Function_O();
		Function_O app3 = new Function_O();
		double ans3 = app3.add(1.36, 20);
		double ans2 = app2.add(2, 3.50);
		double ans1 = app1.add(12.5, 12.5);
		int ans = app.add(10, 12);
		System.out.println("Addition is: " + ans);
		System.out.println("Addition is:" + ans1);
		System.out.println("Addition is: " + ans2);
		System.out.println("Addition is:" + ans3);
	}

	public int add(int num1, int num2) {
		int temp;
		temp = num1 + num2;
		return temp;

	}

	public double add(double num1, double num2) {
		double temp;
		temp = num1 + num2;
		return temp;
	}

	public double add(int num1, double num2) {
		double temp;
		temp = num1 + num2;
		return temp;
	}

	public double add(double num1, int num2) {
		double temp;
		temp = num1 + num2;
		return temp;
	}
}
