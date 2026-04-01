package com.practical.lab2;

import java.util.Scanner;

class DrivingCost {
	private float miles, costPerGallon, fees, tolls;

	DrivingCost(float miles, float costPerGallon, float fees, float tolls) {
		this.miles = miles;
		this.costPerGallon = costPerGallon;
		this.fees = fees;
		this.tolls = tolls;
	}

	float calculateDailyDrivingCost() {
		return miles * costPerGallon + fees + tolls;
	}
}

public class CalculateDrivingCost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float miles, costPerGallon, fees, tolls;
		System.out.print("Enter number of miles driven per day: ");
		miles = input.nextFloat();
		System.out.print("Enter cost per gallon of gasoline: ");
		costPerGallon = input.nextFloat();
		System.out.print("Enter average fees per day: ");
		fees = input.nextFloat();
		System.out.print("Enter tolls per day: ");
		tolls = input.nextFloat();
		DrivingCost dailyDrivingCost = new DrivingCost(miles, costPerGallon, fees, tolls);
		System.out.println("The daily driving cost is " + dailyDrivingCost.calculateDailyDrivingCost());
		input.close();
	}
}
