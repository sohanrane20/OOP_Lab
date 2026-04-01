package com.practical.lab6;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person constructor called");
	}

	void display() {
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
	}
}

class Student extends Person {
	int rollNumber;

	Student(String name, int age, int rollNumber) {
		super(name, age);
		this.rollNumber = rollNumber;
		System.out.println("Student constructor called");
	}

	void display() {
		super.display();
		System.out.println("Roll number = " + this.rollNumber);
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		Student s1 = new Student("John", 20, 101);
		s1.display();
	}
}