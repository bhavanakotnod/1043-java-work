package abstraction;

public class CreditCardPay implements RefundService,NotificationService,PaymentGateway{

	@Override
	public void sendNotification(String message) {
		System.out.println("Credit card notification : "+message );
		
	}

	@Override
	public void refund(double amount) {
		 System.out.println("Refunding ₹" + amount + " to credit card");
    }
		
	

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing credit card payment of Rs. "+amount);
		
	}

}
