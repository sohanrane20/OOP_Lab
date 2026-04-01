package com.practical.lab6;

import java.util.Scanner;

interface ThreeDModel {
	public abstract void readPoint(int x, int y, int z);

	public abstract void printPoint();

	public abstract double calculateDistance(ThreeDPoint point1, ThreeDPoint point2);
}

abstract class ThreeDPoint implements ThreeDModel {
	protected int x, y, z;

	ThreeDPoint() {
		x = 0;
		y = 0;
		z = 0;
	}

	public void readPoint(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void printPoint() {
		System.out.printf("(%d, %d, %d)\n", x, y, z);
	}
}

class Distance extends ThreeDPoint {
	public double calculateDistance(ThreeDPoint point1, ThreeDPoint point2) {
		int x = point1.x - point2.x;
		int y = point1.y - point2.y;
		return Math.sqrt(x * x + y * y);
	}
}

public class ThreeDSpace {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ThreeDPoint point1, point2, distance;
		point1 = new Distance();
		System.out.print("Enter point 1: ");
		point1.readPoint(input.nextInt(), input.nextInt(), input.nextInt());
		point2 = new Distance();
		System.out.print("Enter point 2: ");
		point2.readPoint(input.nextInt(), input.nextInt(), input.nextInt());
		point1.printPoint();
		point2.printPoint();
		distance = new Distance();
		System.out.println(distance.calculateDistance(point1, point2));
		input.close();
	}
}
