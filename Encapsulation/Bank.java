package com.Encapsulation;

public class Bank {
	public static void main(String[] args) {
		Bank_Account b = new Bank_Account();
		
		b.setAccno(12345627);
		b.setAcchlname("Bahvana");
		b.setAmount(78549);
		System.out.println("Account number "+ (b.getAccno()));
		System.out.println("Account holder name "+ (b.getAcchlname()));
		System.out.println("Amount  "+(b.getAmount()));
		
	}

}
