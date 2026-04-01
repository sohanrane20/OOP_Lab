package com.practical.lab1;

import java.util.Scanner;
import java.lang.Math;

class CircleRadius {
	int radius, diameter;

	CircleRadius(int radius) {
		this.radius = radius;
		this.diameter = 2 * radius;
	}

	double circumference() {
		return 2 * Math.PI * radius;
	}

	double area() {
		return Math.PI * radius * radius;
	}
}

public class Circle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int radius = input.nextInt();
		CircleRadius circle = new CircleRadius(radius);
		System.out.println("Radius of circle is " + circle.radius);
		System.out.println("Diameter of circle is " + circle.diameter);
		System.out.println("Circumference of circle is " + circle.circumference());
		System.out.println("Area of circle is " + circle.area());
		input.close();
	}
}
