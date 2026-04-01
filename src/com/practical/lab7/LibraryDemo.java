package com.practical.lab7;
import java.util.Scanner;
enum Period
{
	WEEKLY,
	MONTHLY,
	YEARLY,
}
abstract class Book
{
	protected int bookID;
	protected String title, author;
	protected double price;
	abstract void modifyPrice(double price);
	abstract void displayBook();
}
abstract class Periodical extends Book
{
	protected Period period;
	Periodical(int bookID, String title, String author, double price, Period period)
	{
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.price = price;
		this.period = period;
	}
	abstract void modifyPeriod(Period period);
	void displayBook()
	{
		System.out.println("Book ID is " + bookID);
		System.out.println("Title is " + title);
		System.out.println("Author is " + author);
		System.out.println("Price is " + price);
		System.out.println("Period is " + period);
	}
}
class Library extends Periodical
{
	Library(int bookID, String title, String author, double price, Period period)
	{
		super(bookID, title, author, price, period);
	}
	void modifyPrice(double price)
	{
		this.price = price;
	}
	void modifyPeriod(Period period)
	{
		this.period = period;
	}
}
public class LibraryDemo 
{
	public static void main(String[] args)
	{
		int choice;
		Period period = Period.WEEKLY;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter book ID: ");
		int bookID = input.nextInt();
		System.out.print("Enter title: ");
		String title = input.nextLine();
		System.out.print("Enter author: ");
		String author = input.nextLine();
		System.out.print("Enter price: ");
		double price = input.nextDouble();
		do
		{
			System.out.println("1: Weekly");
			System.out.println("2: Monthly");
			System.out.println("3: Yearly");
			System.out.print("Enter choice: ");
			choice = input.nextInt();
			switch (choice)
			{
				case 1:
					period = Period.WEEKLY;
					break;
				case 2:
					period = Period.MONTHLY;
					break;
				case 3:
					period = Period.YEARLY;
					break;
				default:
					System.out.println("Invalid choice");
			}
		} while (choice < 1 && choice > 3);
		Periodical periodical = new Library(bookID, title, author, price, period);
		periodical.displayBook();
		input.close();
	}
}
