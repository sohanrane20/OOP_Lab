package com.practical.lab4;

import java.util.Scanner;

class Matrix {
	void set(int value, int indexX, int indexY, int indexZ, int[] array) {
		array[indexX * 3 * 3 + indexY * 3 + indexZ] = value;
	}

	int get(int indexX, int indexY, int indexZ, int[] array) {
		return array[indexX * 3 * 3 + indexY * 3 + indexZ];
	}
}

public class MatrixManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Matrix matrix = new Matrix();
		int[] array = new int[3 * 3 * 3];
		System.out.print("Enter elements of 3 D array: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					int value = input.nextInt();
					matrix.set(value, i, j, k, array);
				}
			}
		}
		System.out.println("Elements of 3 D array are \n");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.print(matrix.get(i, j, k, array) + "\t");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		input.close();
	}
}