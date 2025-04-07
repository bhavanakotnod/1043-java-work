package com.constructor;

public class Bank_Details {
	
	    public static void main(String[] args) {
	        // Create a new bank account
	        BankAccount account = new BankAccount("123456789", "John Doe", 500.00);

	        // Display initial account details
	        account.displayAccountDetails();

	        // Perform some transactions
	        account.deposit(200.00); // Deposit $200
	        account.withdraw(100.00); // Withdraw $100
	        account.withdraw(700.00); // Try to withdraw more than the balance
	        account.deposit(-50.00); // Try to deposit a negative amount

	        // Display final account details
	        account.displayAccountDetails();
	    }
	}



