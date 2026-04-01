package com.practical.lab7;
abstract class Debugger
{
	void debug()
	{
		System.out.println("Debugged module");
	}
}
class ModuleA extends Debugger
{
	void execute()
	{
		System.out.println("Module A executed");
	}
}
class ModuleB extends Debugger
{
	void execute()
	{
		System.out.println("Module B executed");
	}
}
public class ProjectBuilder 
{
	public static void main(String[] args) 
	{
		ModuleA a1=new ModuleA();
		a1.debug();
		a1.execute();
		ModuleB b1=new ModuleB();
		b1.debug();
		b1.execute();
	}
}
