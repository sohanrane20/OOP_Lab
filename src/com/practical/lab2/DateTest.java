package com.practical.lab2;

import java.util.Scanner;

class Date {
	private int day, month, year;

	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	int getDay() {
		return day;
	}

	int getMonth() {
		return month;
	}

	int getYear() {
		return year;
	}

	void setDay(int day) {
		this.day = day;
	}

	void setMonth(int month) {
		this.month = month;
	}

	void setYear(int year) {
		this.year = year;
	}

	void displayDate() {
		System.out.print(day + "/" + month + "/" + year);
	}
}

public class DateTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day, month, year;
		System.out.print("Enter day: ");
		day = input.nextInt();
		System.out.print("Enter month: ");
		month = input.nextInt();
		System.out.print("Enter year: ");
		year = input.nextInt();
		Date date = new Date(day, month, year);
		System.out.print("Date is ");
		date.displayDate();
		input.close();
	}
}
