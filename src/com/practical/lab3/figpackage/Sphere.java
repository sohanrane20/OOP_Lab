package com.practical.lab3.figpackage;

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