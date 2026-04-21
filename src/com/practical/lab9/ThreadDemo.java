package com.practical.lab9;
class CustomThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<=100; i+=2) {
			System.out.println(getName()+":"+i);
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		CustomThread thread=new CustomThread();
		thread.start();
		for(int i=1; i<100; i+=2) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
