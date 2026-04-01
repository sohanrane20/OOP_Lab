package com.practical.lab1;

import java.util.Scanner;

class IndivisualDigits {
	private int number;

	IndivisualDigits(int number) {
		this.number = number;
	}

	void separateDigits() {
		int temp = number, rev = 0;
		while (temp > 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		while (rev > 0) {
			System.out.print(rev % 10 + "   ");
			rev /= 10;
		}
	}
}

public class SeparateIndivisualDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, count;
		do {
			System.out.print("Enter number: ");
			number = input.nextInt();
			int temp = number;
			count = 0;
			while (temp > 0) {
				count++;
				temp /= 10;
			}
			if (count != 5)
				System.out.println("Number must contain only 5 digits");
		} while (count != 5);
		IndivisualDigits digits = new IndivisualDigits(number);
		System.out.print("The indivisual digits of " + number + " are ");
		digits.separateDigits();
		input.close();
	}
}
