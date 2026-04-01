package com.practical.lab6;
class WashingMachine {
	private boolean on;
	private int clothesCount;
	private boolean detergentAdded;
	public void switchOn() {
		on = true;
		System.out.println("Washing machine switched on");
	}
	public int acceptClothes(int clothesCount) {
		this.clothesCount = clothesCount;
		System.out.println(clothesCount + " clothes accepted");
		return clothesCount;
	}
	public void acceptDetergent() {
		detergentAdded = true;
		System.out.println("Detergent added.");
	}
	public void switchOff() {
		on = false;
		System.out.println("Washing Machine switched off");
	}
}
public class WashingMachineOperator {
	public static void main(String[] args) {
		WashingMachine machine = new WashingMachine();
		machine.switchOn();
        machine.acceptClothes(5);
        machine.acceptDetergent();
        machine.switchOff();
	}
}
