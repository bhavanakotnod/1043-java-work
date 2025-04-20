package abstraction;

public interface ATM {
	public static final double amount = 78500.80;
    	
	
	void deposite(double amount);
	public abstract void withDraw(double withdraw_amount);
	

}
