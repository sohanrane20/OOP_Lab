package com.practical.lab1;

class Table {
	void writeTable() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%2d\t%3d\t%4d\n", i, i * i, i * i * i);
		}
	}
}

public class SquareCube {
	public static void main(String[] args) {
		Table table = new Table();
		table.writeTable();
	}
}
