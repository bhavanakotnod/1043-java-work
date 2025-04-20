package abstraction;

// Class name with SbiBank implements the Interface 

public class SbiBank implements Bank  {
	@Override
	public void makePayment() {
		System.out.println("SBI stand for state bank of india");    
		
	}
	public static void main(String[] args) {
		Bank b = new SbiBank();     //You need to instantiate a class that implements Bank
		b.makePayment();
		
		SbiBank s = new SbiBank();
		s.makePayment();
		
		
		
	}
	

}
