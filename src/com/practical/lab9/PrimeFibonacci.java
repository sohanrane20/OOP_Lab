package com.practical.lab9;

//numbers domain is till 100

//choose fibonacci as lock

class Prime extends Thread{
	Fibonacci fibonacci;
	Prime(Fibonacci fibonacci, String name){
		super(name);
		this.fibonacci=fibonacci;
	}
	
	@Override
	public void run() {
		synchronized(fibonacci) {
			int prime=0;
			for(int i=2; i<=1000; i++) {
				int j;
				for(j=2; j<=i; j++) {
					if(i%j==0) {
						break;
					}
				}
				if(j==i) {
					
					prime++;
					System.out.println(getName()+":"+prime+"->"+i);
				}
				
				if(prime%25==0) {
					fibonacci.notify();
					try {
						fibonacci.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
class Fibonacci extends Thread{
	Fibonacci(String name){
		super(name);
	}
	@Override
	public void run() {
		synchronized(this) {
				int a=0, b=1, c;
				for(int i=1; i<=500; i++) {
					c=a+b;
					a=b;
					b=c;
					
					System.out.println(getName()+":"+i+"->"+c);
					if(i%50==0) {
						this.notify();
						try {
							this.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
		}
		
	}
}
public class PrimeFibonacci {
	public static void main(String[] args) {
		Fibonacci fibonacci=new Fibonacci("fibonacci");
		Prime prime=new Prime(fibonacci, "prime");
		fibonacci.start();
		prime.start();
	}
}
