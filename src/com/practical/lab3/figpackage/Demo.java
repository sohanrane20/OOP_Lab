package com.practical.lab3.figpackage;
import java.util.Scanner;
class Demo 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Cone cone = new Cone();
		System.out.print("Enter radius of cone: ");
		cone.r = input.nextDouble();
		System.out.print("Enter height of cone: ");
		cone.h = input.nextDouble();
		System.out.print("Enter slant height of Cone: ");
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