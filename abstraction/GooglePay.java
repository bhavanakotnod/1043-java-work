package abstraction;

public class GooglePay implements OnlinePayment {
	public void makePayment() {
		System.out.println("Google pay also used to make a online payment");
	}
	
	public static void main(String[] args) {
		OnlinePayment p = new GooglePay();
		p.makePayment();
		
		OnlinePayment o =new PhonePay();
		o.makePayment();
	}

}
