package com.practical.lab9;
class CustomRunnable implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<=100; i+=2) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
public class RunnableDemo {
	public static void main(String[] args) {
		CustomRunnable runnable=new CustomRunnable();
		new Thread(runnable).start();
		for(int i=1; i<100; i+=2) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
