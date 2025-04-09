package ScannerClass;
import java.util.Scanner;
public class BankDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a bank account holder name");
		String name = sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter balance in the account ");
		double balance = sc.nextDouble();
		
	

		Bank bank = new Bank();
		
		bank.deposite(600);
		bank.withdraw(100);
		
		bank.deposite(20);
		
		bank.Bank_Details();
		
	}

}
