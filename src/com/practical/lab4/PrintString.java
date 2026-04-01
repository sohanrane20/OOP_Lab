package com.practical.lab4;

import java.util.Scanner;

class Substring {
	String text;
	int n;

	Substring(String text, int n) {
		this.text = text;
		this.n = n;
	}

	void printSubstring() {
		for (int i = n; i < text.length(); i++) {
			System.out.print(text.charAt(i));
		}
	}
}

public class PrintString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		String text;
		System.out.print("Enter string: ");
		text = input.nextLine();
		System.out.print("Enter position of character: ");
		n = input.nextInt();
		Substring substring = new Substring(text, n);
		System.out.print("Substring is ");
		substring.printSubstring();
		input.close();
	}
}
