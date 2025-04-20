package abstraction;

public class AmazonOrder implements OrderPlcement, Payment, Delivery {
	String item;
	int quantity;
	double amount;
	String address;

	@Override
	public void placeOrder(String item, int quantity) {
		this.item = item;
		this.quantity = quantity;
		System.out.println("placed quantity : " + quantity + " X " + item);

	}

	@Override
	public void makePayment(double amount) {
		this.amount = amount;
		System.out.println("Payment of Rs." + amount + " completed.");

	}

	@Override
	public void deliverorder(String address) {
		this.address = address;
		System.out.println("Order will be delivered to  " + address);

	}

}
