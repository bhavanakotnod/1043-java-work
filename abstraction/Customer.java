package abstraction;

public class Customer  implements ATM  {

	

	@Override
	public void deposite(double deposite_amount) {
		System.out.println("initial amount is "+amount);
		System.out.println("deposite  amount "+deposite_amount);
		deposite_amount = amount+deposite_amount;
		System.out.println("total amount of money  after deposited is "+ deposite_amount);
		
		
	}
	@Override
	public void withDraw(double withdraw_amount) {
	
		System.out.println("initial amount is "+amount);
		System.out.println("withdraw "+withdraw_amount);
		withdraw_amount =   amount - withdraw_amount;
		System.out.println("after withdraw amount is  "+ withdraw_amount);
		
		
	}

}
