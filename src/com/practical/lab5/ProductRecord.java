package com.practical.lab5;

import java.util.Scanner;

class Product {
	protected int productID;
	protected String name;
	protected int categoryID;
	protected float unitPrice;
}

class ElectricalProduct extends Product {
	private int voltageRange, wattage;

	ElectricalProduct(int productID, String name, int categoryID, float unitPrice, int voltageRange, int wattage) {
		this.productID = productID;
		this.name = name;
		this.categoryID = categoryID;
		this.unitPrice = unitPrice;
		this.voltageRange = voltageRange;
		this.wattage = wattage;
	}

	void changeWattage(int wattage) {
		this.wattage = wattage;
	}

	void changeUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	void displayRecord() {
		System.out.println("Product ID is " + productID);
		System.out.println("Name is " + name);
		System.out.println("Category ID is " + categoryID);
		System.out.println("Unit price is " + unitPrice);
		System.out.println("Voltage range is " + voltageRange);
		System.out.println("Wattage is " + wattage);
	}
}

public class ProductRecord {
	public static void main(String[] args) {
		int choice;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter product ID: ");
		int productID = input.nextInt();
		System.out.print("Enter name: ");
		input.nextLine();
		String name = input.nextLine();
		System.out.print("Enter category ID: ");
		int categoryID = input.nextInt();
		System.out.print("Enter unit price: ");
		float unitPrice = input.nextFloat();
		System.out.print("Enter voltage range: ");
		int voltageRange = input.nextInt();
		System.out.print("Enter wattage: ");
		int wattage = input.nextInt();
		ElectricalProduct electricalProduct = new ElectricalProduct(productID, name, categoryID, unitPrice,
				voltageRange, wattage);
		do {
			System.out.println("1: Change wattage");
			System.out.println("2: Change unit price");
			System.out.println("3: Display product record");
			System.out.print("Enter choice: ");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter wattage: ");
				wattage = input.nextInt();
				electricalProduct.changeWattage(wattage);
				break;
			case 2:
				System.out.print("Enter unit price: ");
				unitPrice = input.nextInt();
				electricalProduct.changeUnitPrice(unitPrice);
				break;
			case 3:
				electricalProduct.displayRecord();
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice >= 1 && choice <= 3);
		input.close();
	}
}