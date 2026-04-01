package com.practical.casebased;
import java.util.Scanner;
interface Health {
	public static final double KG = 0.45359237, M = 0.0254;
	public abstract double compute();
}
class BMI implements Health {
	private double weight, height;
	BMI(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	public double compute() {
		return (weight * KG) / ((height * M) * (height * M));
	}
	
}
public class ComputeBMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double height,weight;
		System.out.print("Enter height (in pounds): ");
		height = input.nextDouble();
		System.out.print("Enter weight (in pounds): ");
		weight = input.nextDouble();
		Health health = new BMI(height, weight);
		System.out.println("BMI = " + health.compute());
		input.close();
	}
}
