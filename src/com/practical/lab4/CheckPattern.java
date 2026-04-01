package com.practical.lab4;

import java.util.Scanner;

class Pattern {
	String pattern;
	int a, b;

	int countPatterns() {
		int count = 0;
		for (int i = a; i <= b; i++) {
			String number = String.valueOf(i);
			if (number.contains(pattern)) {
				count++;
			}
		}
		return count;
	}
}

public class CheckPattern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pattern checkPattern = new Pattern();
		System.out.print("Enter range: ");
		checkPattern.a = input.nextInt();
		checkPattern.b = input.nextInt();
		System.out.print("Enter pattern: ");
		input.nextLine();
		checkPattern.pattern = input.next();
		System.out.println("The number of times " + checkPattern.pattern + " occured between " + checkPattern.a
				+ " and " + checkPattern.b + " is " + checkPattern.countPatterns());
		input.close();
	}
}
