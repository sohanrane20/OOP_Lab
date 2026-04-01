package com.practical.lab1;
import java.util.Scanner;
class CalculateResult
{
	private float a, b;
	CalculateResult(float a, float b)
	{
		this.a = a;
		this.b = b;
	}
	float sum()
	{
		return a + b;
	}
	float difference()
	{
		return a - b;
	}
	float product()
	{
		return a * b;
	}
	float quotient()
	{
		return a / b;
	}
	int remainder()
	{
		return (int)a % (int)b;
	}
}
public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int choice;
		float a, b;
		do
		{
			System.out.println("1: Sum");
			System.out.println("2: Difference");
			System.out.println("3: Product");
			System.out.println("4: Quotient");
			System.out.println("5: Remainder");
			System.out.print("Enter choice: ");
			choice = input.nextInt();
			if (choice < 1 || choice > 5)
			{
				System.out.println("Invalid choice");
				break;
			}
			System.out.print("Enter number 1: ");
			a = input.nextFloat();
			System.out.print("Enter number 2: ");
			b = input.nextFloat();
			CalculateResult result = new CalculateResult(a, b);
			switch (choice)
			{
				case 1:
					System.out.println("Sum of " + a + " and " + b + " is " + result.sum());
					break;
				case 2:
					System.out.println("Difference of " + a + " and " + b + " is " + result.difference());
					break;
				case 3:
					System.out.println("Product of " + a + " and " + b + " is " + result.product());
					break;
				case 4:
					System.out.println("Quotient of " + a + " and " + b + " is " + result.quotient());
					break;
				case 5:
					System.out.println("Remainder of " + a + " and " + b + " is " + result.remainder());
					break;
				default:
					System.out.println("Invalid choice");
			}
		} while (choice >= 1 && choice <= 5);
		input.close();
	}
}
