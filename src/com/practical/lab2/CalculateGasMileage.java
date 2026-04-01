package com.practical.lab2;
import java.util.Scanner;
class GasMileage
{
	float miles, gallons;
	static float totalMiles, totalGallons;
	GasMileage(float miles, float gallons)
	{
		this.miles = miles;
		this.gallons = gallons;
	}
	float calculateMilesPerGallon()
	{
		return miles / gallons;
	}
	static float calculateCombinedMilesPerGallon()
	{
		return totalMiles / totalGallons;
	}
}
public class CalculateGasMileage 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int i;
		char another;
		float miles, gallons;
		i = 1;
		do
		{
			System.out.println("Trip " + i);
			System.out.print("Enter miles: ");
			miles = input.nextFloat();
			System.out.print("Enter gallons: ");
			gallons = input.nextFloat();
			GasMileage gasMileage = new GasMileage(miles, gallons);
			System.out.println("Miles per gallon for trip " + i + " is " + gasMileage.calculateMilesPerGallon());
			GasMileage.totalMiles += miles;
			GasMileage.totalGallons += gallons;
			System.out.println("Combined miles per gallon upto this point is " + GasMileage.calculateCombinedMilesPerGallon());
			i++;
			System.out.print("Do you want to continue? (Y/N) ");
			input.nextLine();
			another = input.nextLine().toUpperCase().charAt(0);
			if (another != 'Y' && another != 'N')
				System.out.println("Invalid choice");
		} while (another == 'Y');
		input.close();
	}
}
