package com.practical.lab4;
import java.util.Scanner;
interface Function
{
	public abstract int evaluate(int number);
}
class Half implements Function
{
	public int evaluate(int number)
	{
		return number / 2;
	}
	
}
public class Client 
{
	static int[] halfNumbers(int[] numbers)
	{
		Half half = new Half();
		int[] halvedNumbers = new int[5];
		for (int i = 0; i < 5; i++)
		{
			halvedNumbers[i] = half.evaluate(numbers[i]);
		}
		return halvedNumbers;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.print("Enter numbers: ");
		for (int i = 0; i < 5; i++)
		{
			numbers[i] = input.nextInt();
		}
		int[] halvedNumbers = halfNumbers(numbers);
		System.out.print("Halved numbers are ");
		for (int element : halvedNumbers)
		{
			System.out.print(element + "\t");
		}
		input.close();
	}
}
