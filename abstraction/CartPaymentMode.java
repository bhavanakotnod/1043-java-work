package abstraction;

public class CartPaymentMode {
	public static void main(String[] args) {
		 Cart c;
		
		c= new CashOnDelivery();
		c.checkOut();
		
		c = new UPIPayment();
		c.checkOut();
		
		c = new CreditCardPayment();
		c.checkOut();
		
		
		
	}

}
