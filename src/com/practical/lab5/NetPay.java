package com.practical.lab5;

import java.util.Scanner;

interface Salary {
	int TAX_RATE = 15, HOURLY_RATE = 12;

	void calculateGrossPay();

	void calculateTax();

	void calculateNetPay();
}

class CalculateTax implements Salary {
	private float hours, grossPay, tax, netPay;

	CalculateTax(float hours) {
		this.hours = hours;
	}

	public void calculateGrossPay() {
		grossPay = hours * HOURLY_RATE / 100;
	}

	public void calculateTax() {
		tax = grossPay * TAX_RATE / 100;
	}

	public void calculateNetPay() {
		netPay = grossPay - tax;
	}

	void printSalary() {
		System.out.println("Gross pay is " + grossPay);
		System.out.println("Tax is " + tax);
		System.out.println("Net pay is " + netPay);
	}
}

public class NetPay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter hours: ");
		float hours = input.nextFloat();
		CalculateTax salary = new CalculateTax(hours);
		salary.calculateGrossPay();
		salary.calculateTax();
		salary.calculateNetPay();
		salary.printSalary();
		input.close();
	}
}
