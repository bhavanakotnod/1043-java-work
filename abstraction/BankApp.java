package abstraction;

import java.util.Scanner;

public class BankApp implements Deposite, Withdraw, BalanceCheck {

	@Override
	public void bankBalance(double amount) {
		double deposite = 2000;
		System.out.println("deposited amount " + deposite);
		amount = amount + deposite;
		System.out.println("saving...." + amount);

		double withdraw = 200;
		amount = amount - withdraw;
		System.out.println("after withdrawal of amount " + amount);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter pin for check the balance");
		String pin = sc.nextLine();
		System.out.println("your bank balance is " + amount);

	}

}
