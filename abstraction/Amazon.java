package abstraction;

public class Amazon {
	public static void main(String[] args) {
		AmazonOrder order = new AmazonOrder();
		order.placeOrder("BoLttWatch", 1);
		order.makePayment(1200.30);
		order.deliverorder("Chinchwd , Pimpari-Chinchwad pune 410506");
	}

}
