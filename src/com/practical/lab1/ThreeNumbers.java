package com.practical.lab1;
import java.util.Scanner;
class ManipulateNumbers
{
	private int[] numbers = new int[3];
	ManipulateNumbers(int[] numbers)
	{
		this.numbers = numbers;
	}
	int sum()
	{
		int sum = 0;
		for (int i = 0; i < 3; i++)
		{
			sum += numbers[i];
		}
		return sum;
	}
	double average()
	{
		return (double)sum() / 3;
	}
	int product()
	{
		int product = 1;
		for (int number : numbers)
		{
			product *= number;
		}
		return product;
	}
	int max()
	{
		int max = numbers[0];
		for (int i = 1; i < 3; i++)
		{
			if (numbers[i] > max)
			{
				max = numbers[i];
			}
		}
		return max;
	}
	int min()
	{
		int min = numbers[0];
		for (int i = 1; i < 3; i++)
		{
			if (numbers[i] < min)
			{
				min = numbers[i];
			}
		}
		return min;
	}
}
public class ThreeNumbers 
{
	public static void main(String[] args)
	{
		int choice;
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("1: Sum");
			System.out.println("2: Average");
			System.out.println("3: Product");
			System.out.println("4: Largest number");
			System.out.println("5: Smallest number");
			System.out.print("Enter choice: ");
			choice = input.nextInt();
			if (choice < 1 || choice > 5)
			{
				System.out.println("Invalid choice");
				break;
			}
			int[] numbers = new int[3];
			for (int i = 0; i < 3; i++)
			{
				System.out.print("Enter number " + (i + 1) + ": ");
				numbers[i] = input.nextInt();
			}
			ManipulateNumbers result = new ManipulateNumbers(numbers);
			switch (choice)
			{
				case 1:
					System.out.println("Sum is " + result.sum());
					break;
				case 2:
					System.out.println("Average is " + result.average());
					break;
				case 3:
					System.out.println("Product is " + result.product());
					break;
				case 4:
					System.out.println("Largest number is " + result.max());
					break;
				case 5:
					System.out.println("Smallest number is " + result.min());
					break;
				default:
					System.out.println("Invalid choice");
			}
		} while (choice >= 1 && choice <= 5);
		input.close();
	}
}
