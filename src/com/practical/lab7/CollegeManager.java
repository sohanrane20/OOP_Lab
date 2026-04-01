package com.practical.lab7;
abstract class Teacher
{
	String name, department;
	void setTeacherProfile(String name, String department)
	{
		this.name=name;
		this.department=department;
	}
	void displayTeacherProfile()
	{
		System.out.println("Teacher name="+name);
		System.out.println("Teacher department="+department);
	}
}
class Student extends Teacher
{
	int rollNumber, year;
	Student(int rollNumber, int year)
	{
		this.rollNumber=rollNumber;
		this.year=year;
	}
	void displayStudentProfile()
	{
		System.out.println("Student name="+name);
		System.out.println("Student department="+department);
		System.out.println("Student roll number="+rollNumber);
		System.out.println("Student year of study="+year);
	}
}
public class CollegeManager 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(12, 1);
		s1.setTeacherProfile("abc", "AI");
		s1.displayTeacherProfile();
		s1.displayStudentProfile();
	}
}
