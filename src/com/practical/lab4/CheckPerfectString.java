package com.practical.lab4;
import java.util.Scanner;
class PerfectString
{
	String text;
	boolean checkPerfectString()
	{
		for (int i = 0; i < text.length(); i++)
		{
			for (int j = i + 1; j < text.length(); j++)
			{
				if (text.charAt(i) == text.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
}
public class CheckPerfectString 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PerfectString perfectString = new PerfectString();
		System.out.print("Enter string: ");
		perfectString.text = input.nextLine();
		if (perfectString.checkPerfectString())
		{
			System.out.println("It is a perfect string");
		}
		else
		{
			System.out.println("It is not a perfect string");
		}
		input.close();
	}
}
