package com.practical.lab7;
import java.util.Scanner;
interface SimpleInterest
{
	public abstract float calculateSimpleInterest();
}
interface Account extends SimpleInterest
{
	public abstract float calculateAggregateBalance();
}
class SavingsAccount implements Account
{
	private int principal, time;
	private float rate;
	SavingsAccount(int principal, float rate, int time)
	{
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}
	public float calculateSimpleInterest()
	{
		return (float)principal * ((float)time / 12) * (rate / 100.0f);
	}
	public float calculateAggregateBalance()
	{
		float interest = calculateSimpleInterest();
		return (float)principal + interest;
	}
}
public class SimpleInterestCalculator 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int principal, time;
		float rate;
		System.out.print("Enter principal: ");
		principal = input.nextInt();
		System.out.print("Enter annual rate of interest: ");
		rate = input.nextFloat();
		System.out.print("Enter number of months: ");
		time = input.nextInt();
		SavingsAccount account = new SavingsAccount(principal, rate, time);
		System.out.println("Simple interest is " + account.calculateSimpleInterest());
		System.out.println("Aggregate balance is " + account.calculateAggregateBalance());
		input.close();
	}
}
