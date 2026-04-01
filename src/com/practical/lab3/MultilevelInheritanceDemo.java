package com.practical.lab3;

import java.util.Scanner;

class X {
	int i, j;

	X(int i, int j) {
		this.i = i;
		this.j = j;
	}

	int findSum() {
		return i + j;
	}
}

class Y extends X {
	Y(int i, int j) {
		super(i, j);
	}

	int findProduct() {
		return i * j;
	}
}

class Z extends Y {
	Z(int i, int j) {
		super(i, j);
	}

	int findDifference() {
		return i - j;
	}
}

public class MultilevelInheritanceDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int i = input.nextInt();
		System.out.print("Enter number 2: ");
		int j = input.nextInt();
		Z demo = new Z(i, j);
		System.out.println("Sum is " + demo.findSum());
		System.out.println("Product is " + demo.findProduct());
		System.out.println("Difference is " + demo.findDifference());
		input.close();
	}
}
