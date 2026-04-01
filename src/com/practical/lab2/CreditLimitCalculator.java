package com.practical.lab2;

import java.util.Scanner;

class Account {
	private int accountNumber;
	private float balance, totalCharges, totalCredits, creditLimit;

	Account(int accountNumber, float balance, float totalCharges, float totalCredits, float creditLimit) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.totalCharges = totalCharges;
		this.totalCredits = totalCredits;
		this.creditLimit = creditLimit;
	}

	int getAccountNumber() {
		return accountNumber;
	}

	boolean hasExceededCreditLimit() {
		return (balance + totalCharges) - totalCredits > creditLimit;
	}
}

public class CreditLimitCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int accountNumber;
		float balance, totalCharges, totalCredits, creditLimit;
		System.out.print("Enter account number: ");
		accountNumber = input.nextInt();
		System.out.print("Enter balance: ");
		balance = input.nextFloat();
		System.out.print("Enter total charges: ");
		totalCharges = input.nextFloat();
		System.out.print("Enter total credits: ");
		totalCredits = input.nextFloat();
		System.out.print("Enter credit limit: ");
		creditLimit = input.nextFloat();
		Account account = new Account(accountNumber, balance, totalCharges, totalCredits, creditLimit);
		if (account.hasExceededCreditLimit() == true)
			System.out.println("The customer whose account number is " + account.getAccountNumber()
					+ " exceeded his/her credit limit");
		else
			System.out.println("The customer whose account number is " + account.getAccountNumber()
					+ " not exceeded his/her credit limit");
		input.close();
	}
}
