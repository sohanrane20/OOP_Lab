package com.practical.lab2;
import java.util.Scanner;
class GarageCharges
{
	int hours;
	float calculateCharges()
	{
		float charges = 0.0f;
		if (hours <= 3)
			charges = 2.0f;
		else if (hours > 3 && hours < 24)
			charges = 2.0f + (hours - 3) * 0.5f;
		else if (hours == 24)
			charges = 10.0f;
		return charges;
	}
}
public class CalculateGarageCharges 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		GarageCharges garageCharges = new GarageCharges();
		System.out.print("Enter number of hours: ");
		garageCharges.hours = input.nextInt();
		System.out.println("The parking charges are " + garageCharges.calculateCharges());
		input.close();
	}
}
