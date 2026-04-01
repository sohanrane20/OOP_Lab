package com.practical.lab3;

import java.util.Scanner;

abstract class Figure {
	public static final double PI = 3.142;

	public abstract void calcArea();

	public abstract void calcVol();

	public abstract void dispArea();

	public abstract void dispVol();
}

class Cone extends Figure {
	double r, h, l, a, v;

	public void calcArea() {
		a = 2 * PI * r * l + PI * r * r;
	}

	public void calcVol() {
		v = PI * r * r * h / 3;
	}

	public void dispArea() {
		System.out.println("Area of cone is " + a);
	}

	public void dispVol() {
		System.out.println("Volume of cone is " + v);
	}
}

class Sphere extends Figure {
	double r, a, v;

	public void calcArea() {
		a = 4 * PI * r * r;
	}

	public void calcVol() {
		v = 4 * PI * r * r * r / 3;
	}

	public void dispArea() {
		System.out.println("Area of sphere is " + a);
	}

	public void dispVol() {
		System.out.println("Volume of sphere is " + v);
	}
}

class Cylinder extends Figure {
	double r, h, a, v;

	public void calcArea() {
		a = 2 * PI * r * h + PI * r * r;
	}

	public void calcVol() {
		v = PI * r * r * h / 3;
	}

	public void dispArea() {
		System.out.println("Area of cylinder is " + a);
	}

	public void dispVol() {
		System.out.println("Volume of cylinder is " + v);
	}
}

public class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cone cone = new Cone();
		System.out.print("Enter radius of cone: ");
		cone.r = input.nextDouble();
		System.out.print("Enter height of cone: ");
		cone.h = input.nextDouble();
		System.out.print("Enter slant height of cone: ");
		cone.l = input.nextDouble();
		cone.calcArea();
		cone.calcVol();
		cone.dispArea();
		cone.dispVol();
		Sphere sphere = new Sphere();
		System.out.print("Enter radius of sphere: ");
		sphere.r = input.nextDouble();
		sphere.calcArea();
		sphere.calcVol();
		sphere.dispArea();
		sphere.dispVol();
		Cylinder cylinder = new Cylinder();
		System.out.print("Enter radius of cylinder: ");
		cylinder.r = input.nextDouble();
		System.out.print("Enter height of cylinder: ");
		cylinder.h = input.nextDouble();
		cylinder.calcArea();
		cylinder.calcVol();
		cylinder.dispArea();
		cylinder.dispVol();
		input.close();
	}
}
