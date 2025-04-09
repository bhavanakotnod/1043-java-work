package ScannerClass;

public class Bank {
	String account_holder;
	double balance;
	
	  public void deposite(double amount) {
		  if(amount>0) {
			  balance += amount;
			  System.out.println("deposite amount "+amount);
		  }else {
			  System.out.println("Amount is greater than zero");
		  }
	  }
	  public void withdraw(double amount) {
		  if(amount>0) {
			  if(amount<= balance) {
				  amount -= balance;
				  System.out.println("withdraw amount :Rs "+amount);
			  }else {
				  System.out.println("insufficient balance");
			  }
		  }else {
			  System.out.println("amount greater than zero");
		  }
	  }
	  public void Bank_Details() {
		 // System.out.println("Bank account holder "+ account_holder);
		  System.out.println("Balanace in account "  + balance);
	  }
	

}
