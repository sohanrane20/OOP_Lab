package com.practical.lab9;

//account is locked in this question so that father and son do not use it at the same time

//assume father deposits 100 in each transaction
//son is assumed to withdraw 50 at one time

//the program continues infinitely

class Account{
	int balance;
	Account(){
		balance=500;
	}
}
class Father extends Thread{
	Account account;
	Father(Account account, String name){
		super(name);
		this.account=account;
	}
	@Override
	public void run() {
		synchronized(account) {
		
			while(account.balance<=500) {
				while(account.balance<2000) {
					account.balance+=100;
					System.out.println(getName()+" deposits "+100+" (balance: "+account.balance+")");
				}
				account.notify();//notify single thread waiting on account object
				try {
					account.wait();//current thread waits i.e. current thread releases account object lock
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		
		}
	}
}
class Son extends Thread{
	Account account;
	Son(Account account, String name){
		super(name);
		this.account=account;
	}
	@Override
	public void run() {
		synchronized(account) {
		
			while(account.balance>=2000) {
				while(account.balance>500) {
					account.balance-=50;
					System.out.println(getName()+" withdraws "+50+" (balance: "+account.balance+")");
				}
				account.notify();//first notify to activate father again
				try {
					account.wait();//after notifying father block son
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		
		}
	}
}
public class FatherSonAccount {
	public static void main(String[] args) {
		Account account=new Account();
		Father father=new Father(account, "father");
		Son son=new Son(account, "son");
		father.start();
		son.start();
	}
}
