package com.practical.casebased;

import java.util.Scanner;

abstract class Physics {
	protected float initialVelocity, finalVelocity, time;

	abstract float calculate();

	Physics(float initialVelocity, float finalVelocity, float time) {
		this.initialVelocity = initialVelocity;
		this.finalVelocity = finalVelocity;
		this.time = time;
	}
}

class AverageAcceleration extends Physics {
	AverageAcceleration(float initialVelocity, float finalVelocity, float time) {
		super(initialVelocity, finalVelocity, time);
	}

	float calculate() {
		return (finalVelocity - initialVelocity) / time;
	}
}

public class Acceleration {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float v0, v1, t;
		System.out.print("Enter starting velocity: ");
		v0 = input.nextFloat();
		System.out.print("Enter ending velocity: ");
		v1 = input.nextFloat();
		System.out.print("Enter time: ");
		t = input.nextFloat();
		Physics a = new AverageAcceleration(v0, v1, t);
		System.out.println("Average acceleration = " + a.calculate());
		input.close();
	}
}
