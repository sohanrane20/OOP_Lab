package com.practical.lab5;
import java.util.Scanner;
abstract class Student
{
	protected String name;
	protected float[] marks = new float[3];
	Student(String name, float[] marks)
	{
		this.name = name;
		this.marks = marks;
	}
	abstract float calculateAverage();
	abstract boolean hasPassed();
	String getName()
	{
		return name;
	}
}
class Result extends Student
{
	Result(String name, float[] marks)
	{
		super(name, marks);
	}
	float calculateAverage()
	{
		float sum = 0;
		for (int i = 0; i < marks.length; i++)
		{
			sum += marks[i];
		}
		return sum / 3;
	}
	boolean hasPassed()
	{
		return calculateAverage() > 50;
	}
}
public class ExamResult 
{
	public static void main(String[] args)
	{
		float[] marks = new float[3];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = input.nextLine();
		for (int i = 0; i < marks.length; i++)
		{
			System.out.printf("Enter marks in exam %d: ", i + 1);
			marks[i] = input.nextFloat();
		}
		Student student = new Result(name, marks);
		if (student.hasPassed())
		{
			System.out.println(student.getName() + " has passed the exam");
		}
		else
		{
			System.out.println(student.getName() + " has failed the exam");
		}
		input.close();
	}
}
