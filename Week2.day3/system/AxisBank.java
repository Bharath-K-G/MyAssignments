package org.system;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("The new deposit amount is 50000");
	}
	
	public static void main(String[] args) {
		AxisBank AB = new AxisBank();
		
		AB.deposit();
	}

}
