package com.practical.lab9;

/*
as either of sin and cos can finish earlier than the other
but output is printed at the same time
so when one of the threads finishes output is printed regardless of other thread to complete

hence, wait and notify is essential in this question
*/

/*
in this case, since there is no defined entity to lock
thus, we choose any one of the two threads as lock

*/

/*
assume cos to be lock
sin waits for cos
cos waits for itself
*/

//this makes wait and notify applicable

class Sin extends Thread{
	int x;
	double value;
	Cos cos;
	Sin(int x, Cos cos){
		this.x=x;
		value=0;
		
		this.cos=cos;
	}
	double factorial(int n) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	@Override
	public void run() {
		synchronized(cos) {
		
			for(int i=0; i<10; i++) {
				int mul=(i%2==0) ? 1 : -1;
				value+=(double)mul*Math.pow(x, 2*i+1)/factorial(2*i+1);
			}
			cos.notify();//notify threads waiting for cos
			try {
				cos.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Cos extends Thread{
	int x;
	double value;
	Cos(int x){
		this.x=x;
		value=0;
	}
	double factorial(int n) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	@Override
	public void run() {
		
		synchronized(this) {
		
			for(int i=0; i<=10; i++) {
				int mul=(i%2==0) ? 1 : -1;
				value+=(double)mul*Math.pow(x, 2*i)/factorial(2*i);
			}
			
			this.notify();
			
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}
}
public class SinCos {
	public static void main(String[] args) {
		int x=(int)(60.0*Math.PI/180.0);
		
		Cos cos=new Cos(x);
		Sin sin=new Sin(x, cos);
		
		cos.start();
		sin.start();
				
		System.out.println("Series function");
		System.out.println("sin("+x+")="+sin.value);
		System.out.println("cos("+x+")="+cos.value);
		
		System.out.println("Math class methods");
		System.out.println("sin("+x+")="+Math.sin(x));
		System.out.println("cos("+x+")="+Math.cos(x));
	}
}
