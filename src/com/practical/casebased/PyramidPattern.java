package com.practical.casebased;

class Pattern {
	static void display() {
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j < 7 - i; j++) {
				System.out.print("    ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.printf("%3d ", (int) Math.pow(2, k));
			}
			for (int l = i - 1; l >= 0; l--) {
				System.out.printf("%3d ", (int) Math.pow(2, l));
			}
			System.out.print("\n");
		}
	}
}

public class PyramidPattern {
	public static void main(String[] args) {
		Pattern.display();
	}
}
