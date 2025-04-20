package abstraction;

public class UPIPay implements RefundService,NotificationService,PaymentGateway{

	public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }

    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " to UPI account");
    }

    public void sendNotification(String message) {
        System.out.println("UPI Notification: " + message);
    }
}
