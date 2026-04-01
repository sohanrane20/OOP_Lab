package com.practical.casebased;
import java.util.Scanner;
interface Science {
	public static final int JOULE = 4184;
	public abstract void calculate();
	public abstract void display();
}
class Energy implements Science {
	private double initialTemperature, finalTemperature, m, q;
	Energy(double initialTemperature, double finalTemperature, double m) {
		this.initialTemperature = initialTemperature;
		this.finalTemperature = finalTemperature;
		this.m = m;
	}
	public void calculate() {
		q = m * (finalTemperature - initialTemperature) * JOULE;
	}
	public void display() {
		System.out.println("Energy = " + q);
	}
}
public class CalculateEnergy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double initialTemperature, finalTemperature, m;
		System.out.print("Enter initial temperature: ");
		initialTemperature = input.nextDouble();
		System.out.print("Enter final temperature: ");
		finalTemperature = input.nextDouble();
		System.out.print("Enter amount of water: ");
		m = input.nextDouble();
		Science energy = new Energy(initialTemperature, finalTemperature, m);
		energy.calculate();
		energy.display();
		input.close();
	}
}
