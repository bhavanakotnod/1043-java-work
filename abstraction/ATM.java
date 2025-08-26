package abstraction;

public interface ATM {
	//instance variable
	public static final double amount = 78500.80;
    	
	//method
	void deposite(double amount);
	public abstract void withDraw(double withdraw_amount);
	

}

