package com.practical.casebased;
import java.util.Scanner;
abstract class Airplane {
	protected float length, acceleration;
	protected int velocity;
	Airplane(float acceleration, int velocity) {
		this.acceleration = acceleration;
		this.velocity = velocity;
	}
	abstract void find();
}
class RunwayLength extends Airplane {
	RunwayLength(float acceleration, int velocity) {
		super(acceleration, velocity);
	}
	void find() {
		length = (velocity * velocity) / (2 * acceleration);
	}
}
public class FindRunwayLength {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float acceleration;
		int velocity;
		System.out.print("Enter acceleration: ");
		acceleration = input.nextFloat();
		System.out.print("Enter speed: ");
		velocity = input.nextInt();
		RunwayLength l = new RunwayLength(acceleration, velocity);
		l.find();
		System.out.println("Minimum runway length = " + l.length);
		input.close();
	}
}
