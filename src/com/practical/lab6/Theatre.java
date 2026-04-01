package com.practical.lab6;

import java.util.Scanner;

interface Income {
	public static final float CUSTOMER = 5.0f;

	public abstract double calculateIncome();
}

interface Expenses {
	public static final double PERFORMANCE = 20;
	public static final float ATTENDEE = 0.5f;

	public abstract double calculateExpenses();
}

class TotalProfit implements Income, Expenses {
	int numberOfCustomers, numberOfPerformances;

	TotalProfit(int numberOfCustomers, int numberOfPerformances) {
		this.numberOfCustomers = numberOfCustomers;
		this.numberOfPerformances = numberOfPerformances;
	}

	public double calculateIncome() {
		return (double) CUSTOMER * numberOfCustomers;
	}

	public double calculateExpenses() {
		return PERFORMANCE * numberOfPerformances + (double) ATTENDEE * numberOfCustomers;
	}

	double calculateProfit() {
		double income = calculateIncome(), expenses = calculateExpenses();
		return income - expenses;
	}
}

public class Theatre {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of customers: ");
		int numberOfCustomers = input.nextInt();
		System.out.print("Enter number of performances: ");
		int numberOfPerformances = input.nextInt();
		TotalProfit totalProfit = new TotalProfit(numberOfCustomers, numberOfPerformances);
		System.out.println("Income of the theatre is " + totalProfit.calculateIncome());
		System.out.println("Expenses of the theatre is " + totalProfit.calculateExpenses());
		System.out.println("Profit of the theatre is " + totalProfit.calculateProfit());
		input.close();
	}
}
