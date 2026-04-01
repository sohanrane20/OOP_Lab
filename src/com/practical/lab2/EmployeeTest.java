package com.practical.lab2;
import java.util.Scanner;
class Employee
{
	private String name, lastName;
	private double monthlySalary;
	Employee(String name, String lastName, double monthlySalary)
	{
		this.name = name;
		this.lastName = lastName;
		if (monthlySalary > 0)
			this.monthlySalary = monthlySalary;
	}
	String getName()
	{
		return name;
	}
	String getLastName()
	{
		return lastName;
	}
	double getMonthlySalary()
	{
		return monthlySalary;
	}
	void setName(String name)
	{
		this.name = name;
	}
	void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	void setMonthlySalary(double monthlySalary)
	{
		if (monthlySalary > 0)
			this.monthlySalary = monthlySalary;
	}
	double calculateYearlySalary()
	{
		return monthlySalary * 12;
	}
}
public class EmployeeTest 
{
	public static void main(String[] args)
	{
		String name, lastName;
		double monthlySalary;
		Scanner input = new Scanner(System.in);
		System.out.println("Employee 1");
		System.out.print("Enter name: ");
		name = input.nextLine();
		System.out.print("Enter last name: ");
		lastName = input.nextLine();
		System.out.print("Enter monthly salary: ");
		monthlySalary = input.nextDouble();
		Employee employee1 = new Employee(name, lastName, monthlySalary);
		System.out.println("Employee 2");
		System.out.print("Enter name: ");
		input.nextLine();
		name = input.nextLine();
		System.out.print("Enter last name: ");
		lastName = input.nextLine();
		System.out.print("Enter monthly salary: ");
		monthlySalary = input.nextDouble();
		Employee employee2 = new Employee(name, lastName, monthlySalary);
		System.out.println("Yearly salary before hike");
		System.out.println("Yearly salary of employee 1 is " + employee1.calculateYearlySalary());
		System.out.println("Yearly salary of employee 2 is " + employee2.calculateYearlySalary());
		monthlySalary = employee1.getMonthlySalary();
		employee1.setMonthlySalary(monthlySalary + (monthlySalary * 10 / 100));
		monthlySalary = employee2.getMonthlySalary();
		employee2.setMonthlySalary(monthlySalary + (monthlySalary * 10 / 100));
		System.out.println("Yearly salary after hike");
		System.out.println("Yearly salary of employee 1 is " + employee1.calculateYearlySalary());
		System.out.println("Yearly salary of employee 2 is " + employee2.calculateYearlySalary());
		input.close();
	}
}
