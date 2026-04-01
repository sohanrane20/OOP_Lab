package com.practical.lab5;
import java.util.Scanner;
abstract class Fruit
{
	protected String name;
	protected boolean isBunch;
	protected float price;
	Fruit(String name, boolean isBunch, float price)
	{
		this.name = name;
		this.isBunch = isBunch;
		this.price = price;
	}
	abstract void displayFruit();
}
class FruitInformation extends Fruit
{
	FruitInformation(String name, boolean isBunch, float price)
	{
		super(name, isBunch, price);
	}
	void displayFruit()
	{
		System.out.println("Name is " + name);
		if (isBunch)
		{
			System.out.println("Bunch fruit");
		}
		else
		{
			System.out.println("Single fruit");
		}
		System.out.println("Price is " + price);
	}
}
public class DisplayFruit 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String name;
		boolean isBunch;
		float price;
		char choice;
		System.out.print("Enter name of the fruit: ");
		name = input.nextLine();
		do
		{
			System.out.print("Is it a bunch fruit? (Y / N) ");
			choice = input.nextLine().toUpperCase().charAt(0);
		} while (choice != 'Y' && choice != 'N');
		isBunch = (choice == 'Y') ? true : false;
		System.out.print("Enter price of the fruit: ");
		price = input.nextFloat();
		Fruit fruit = new FruitInformation(name, isBunch, price);
		fruit.displayFruit();
		input.close();
	}
}
