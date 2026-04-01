package com.practical.lab3.figpackage;

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