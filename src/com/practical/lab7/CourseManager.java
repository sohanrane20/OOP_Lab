package com.practical.lab7;

import java.util.Scanner;

class Course {
	private int id;
	private float duration, fees;
	String description;

	Course(int id, String description, float duration, float fees) {
		this.id = id;
		this.description = description;
		this.duration = duration;
		this.fees = fees;
	}

	void getData() {
		System.out.println("ID = " + id);
		System.out.println("Description = " + description);
		System.out.println("Duration = " + duration + " days");
		System.out.println("Fees = " + fees + " rupees");
	}
}

public class CourseManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int id, n;
		String description;
		float duration, fees;
		System.out.print("Enter number of courses: ");
		n = input.nextInt();
		Course[] courses = new Course[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\nCourse " + (i + 1) + "\n");
			System.out.print("Enter ID: ");
			id = input.nextInt();
			System.out.print("Enter description: ");
			input.nextLine();
			description = input.nextLine();
			System.out.print("Enter duration in days: ");
			duration = input.nextFloat();
			System.out.print("Enter fees: ");
			fees = input.nextFloat();
			courses[i] = new Course(id, description, duration, fees);
		}
		for (int i = 0; i < n; i++) {
			System.out.println("\nCourse " + (i + 1) + "\n");
			courses[i].getData();
		}
		input.close();
	}
}
