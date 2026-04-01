package com.practical.casebased;
import java.util.Scanner;
class Rectangle {
	float x, y, width, height, top, bottom, left, right;
	Rectangle(float x, float y, float width, float height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		top = y + height / 2;
		bottom = y - height / 2;
		left = x - width / 2;
		right = x + width / 2;
	}
	static void check(Rectangle r1, Rectangle r2) {
		if (r2.top <= r1.top && r2.bottom >= r1.bottom && r2.left >= r1.left && r2.right <= r1.right) {
			System.out.println("Rectangle 2 is inside rectangle 1");
		} else if (!(r2.top <= r2.bottom || r2.bottom >= r1.top || r2.left >= r1.right || r2.right <= r1.left)) {
			System.out.println("Rectangle 2 overlaps rectangle 1");
		} else {
			System.out.println("Rectangle 2 does not overlap rectangle 1");
		}
	}
}
public class TwoRectangles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float x, y, width, height;
		System.out.println("Rectangle 1");
		System.out.print("Enter x-coordinate: ");
		x = input.nextFloat();
		System.out.print("Enter y-coordinate: ");
		y = input.nextFloat();
		System.out.print("Enter width: ");
		width = input.nextFloat();
		System.out.print("Enter height: ");
		height = input.nextFloat();
		Rectangle r1 = new Rectangle(x, y, width, height);
		System.out.println("Rectangle 2");
		System.out.print("Enter x-coordinate: ");
		x = input.nextFloat();
		System.out.print("Enter y-coordinate: ");
		y = input.nextFloat();
		System.out.print("Enter width: ");
		width = input.nextFloat();
		System.out.print("Enter height: ");
		height = input.nextFloat();
		Rectangle r2 = new Rectangle(x, y, width, height);
		Rectangle.check(r1, r2);
		input.close();
	}
}
