package com.practical.lab6;
import java.util.Scanner;
abstract class Bank
{
	protected float balance;
	abstract float deposit(float amount);
	abstract float withdraw(float amount);
	Bank(float balance)
	{
		this.balance = balance;
	}
	float getBalance()
	{
		return balance;
	}
}
class Account extends Bank
{
	Account(float balance)
	{
		super(balance);
	}
	float deposit(float amount)
	{
		balance += amount;
		return balance;
	}
	float withdraw(float amount)
	{
		if (balance - amount > 0)
		{
			balance -= amount;
		}
		return balance;
	}
}
public class BankDemo 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float balance, newBalance;
		int choice;
		System.out.print("Enter balance: ");
		balance = input.nextFloat();
		Bank account = new Account(balance);
		do
		{
			System.out.println("1: Get balance");
			System.out.println("2: Deposit money");
			System.out.println("3: Withdraw money");
			System.out.println("0: Exit");
			System.out.print("Enter choice: ");
			choice = input.nextInt();
			switch (choice)
			{
				case 1:
					System.out.println("Balance is " + account.getBalance());
					break;
				case 2:
					System.out.print("Enter amount: ");
					newBalance = account.deposit(input.nextFloat());
					System.out.println("New balance is " + newBalance);
					break;
				case 3:
					balance = account.getBalance();
					System.out.print("Enter amount: ");
					newBalance = account.withdraw(input.nextFloat());
					if (newBalance == balance)
					{
						System.out.println("Not enough balance");
					}
					else
					{
						System.out.println("New balance is " + newBalance);
					}
					break;
				case 0:
					System.out.println("Exit");
					break;
				default:
					System.out.println("Invalid choice");
			}
		} while (choice != 0);
		input.close();
	}
}
