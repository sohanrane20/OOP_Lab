package com.practical.lab1;
import java.util.Scanner;
class Compare
{
	private int a, b;
	Compare(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	void compareNumbers()
	{
		if (a == b)
		{
			System.out.println(a + " is equal to " + b);
		}
		else if (a > b)
		{
			System.out.println(a + " is greater than " + b);
		}
		else
		{
			System.out.println(b + " is greater than " + a);
		}
	}
}
public class CompareNumbers 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a = input.nextInt();
		System.out.print("Enter number 2: ");
		int b = input.nextInt();
		Compare comparison = new Compare(a, b);
		comparison.compareNumbers();
		input.close();
	}
}
