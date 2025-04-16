package com.polymorphism;

public class BankAccount {
	public void deposite(double amount) {
		System.out.println("Deposited amount "+ amount);
	}
	public void deposite(int amount, String mode) {
		System.out.println("amount  "+ amount + "  mode of amount in cheque "+ mode  );
	}
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposite(35000.70);
		b.deposite(70000, "cheque");
	}

}
