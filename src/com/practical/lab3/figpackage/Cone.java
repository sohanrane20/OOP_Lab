package com.practical.lab3.figpackage;
class Cone extends Figure
{
	double r, h, l, a, v;
	public void calcArea()
	{
		a = 2 * PI * r * l + PI * r * r;
	}
	public void calcVol()
	{
		v = PI * r * r * h / 3;
	}
	public void dispArea()
	{
		System.out.println("Area of cone is " + a);
	}
	public void dispVol()
	{
		System.out.println("Volume of cone is " + v);
	}
}