package com.practical.lab2;

import java.util.Scanner;

class Invoice {
	private String partNumber, partDescription;
	private int quantity;
	private double price;

	Invoice(String partNumber, String partDescription, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if (quantity < 0)
			this.quantity = 0;
		else
			this.quantity = quantity;
		if (price < 0)
			this.price = 0.0;
		else
			this.price = price;
	}

	String getPartNumber() {
		return partNumber;
	}

	String getPartDescription() {
		return partDescription;
	}

	int getQuantity() {
		return quantity;
	}

	double getPrice() {
		return price;
	}

	void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	void setQuantity(int quantity) {
		if (quantity < 0)
			this.quantity = 0;
		else
			this.quantity = quantity;
	}

	void setPrice(double price) {
		if (price < 0)
			this.price = 0.0;
		else
			this.price = price;
	}

	double getInvoiceAmount() {
		return price * quantity;
	}
}

public class InvoiceTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String partNumber, partDescription;
		int quantity;
		double price;
		char choice;
		System.out.print("Enter part number: ");
		partNumber = input.nextLine();
		System.out.print("Enter part description: ");
		partDescription = input.nextLine();
		System.out.print("Enter quantity of item: ");
		quantity = input.nextInt();
		System.out.print("Enter price per item: ");
		price = input.nextDouble();
		Invoice invoice = new Invoice(partNumber, partDescription, quantity, price);
		do {
			System.out.println("\nPart number is " + invoice.getPartNumber());
			System.out.println("Part description is " + invoice.getPartDescription());
			System.out.println("Quantity of item is " + invoice.getQuantity());
			System.out.println("Price per item is " + invoice.getPrice());
			System.out.println("\nInvoice amount is " + invoice.getInvoiceAmount());
			input.nextLine();
			while (true) {
				System.out.print("\nDo you want to edit invoice? (Y / N) ");
				choice = input.nextLine().toUpperCase().charAt(0);
				if (choice == 'Y' || choice == 'N') {
					break;
				} else {
					System.out.println("Invalid choice");
				}
			}
			if (choice == 'Y') {
				System.out.print("\nEnter part number: ");
				invoice.setPartNumber(input.nextLine());
				System.out.print("Enter part description: ");
				invoice.setPartDescription(input.nextLine());
				System.out.print("Enter quantity of item: ");
				invoice.setQuantity(input.nextInt());
				System.out.print("Enter price per item: ");
				invoice.setPrice(input.nextDouble());
			}
		} while (choice != 'N');
		input.close();
	}
}
