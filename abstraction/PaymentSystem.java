package abstraction;

public class PaymentSystem {
	public static void main(String[] args) {
		
		 System.out.println("=== Credit Card Payment ===");
	        CreditCardPay ccpayment = new CreditCardPay();
	        ccpayment.processPayment(7000);
	        ccpayment.refund(800);
	        ccpayment.sendNotification("Transaction completed using credit card");
	
	        
	        System.out.println("=== UPI Payment ===");
	        UPIPay upiPayment = new UPIPay();
	        upiPayment.processPayment(750.00);
	        upiPayment.refund(250.00);
	        upiPayment.sendNotification("Transaction completed using UPI.");
	}
	
}
