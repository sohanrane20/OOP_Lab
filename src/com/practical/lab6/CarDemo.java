package com.practical.lab6;

enum CarMode {
	ECO, NORMAL
}

abstract class Car {
	protected String brand, model;
	protected CarMode carMode;
	int engineCapacity;

	Car(String brand, String model, int engineCapacity) {
		this.brand = brand;
		this.model = model;
		this.engineCapacity = engineCapacity;
	}

	void displayCar() {
		System.out.println("Brand is " + brand);
		System.out.println("Model is " + model);
		System.out.println("Engine capacity is " + engineCapacity + " cc");
		System.out.println("Car mode is " + carMode);
	}

	abstract float avg();

	abstract void mode();
}

class Maruti extends Car {
	Maruti(String brand, String model, int engineCapacity) {
		super(brand, model, engineCapacity);
	}

	float avg() {
		return 15920.0f / engineCapacity;
	}

	void mode() {
		carMode = CarMode.ECO;
	}
}

class Santro extends Car {
	Santro(String brand, String model, int engineCapacity) {
		super(brand, model, engineCapacity);
	}

	float avg() {
		return 19548.0f / engineCapacity;
	}

	void mode() {
		carMode = CarMode.NORMAL;
	}
}

public class CarDemo {
	public static void main(String[] args) {
		Car maruti, santro;
		maruti = new Maruti("Maruti", "Alto", 796);
		System.out.println("Maruti");
		System.out.println("Average is " + maruti.avg() + " km / lit");
		maruti.mode();
		maruti.displayCar();
		santro = new Santro("Hyundai", "Santro", 1086);
		System.out.println("Santro");
		System.out.println("Average is " + santro.avg() + " km / lit");
		santro.mode();
		santro.displayCar();
	}
}
