package ArgumentConstructor;

public class Mobile {
	public Mobile(String brand, String model,String price) {
		System.out.println("mobile brand "+ brand);
		System.out.println("mobile model "+ model);
		System.out.println("mobile price "+ price);
	}
	public static void main(String[] args) {
		Mobile m = new Mobile("Redmi mi","pro", "15K");
		System.out.println("----------------");
		Mobile m1 = new Mobile("Samsung Galaxy s23"," ultrapro", "19K");
	}

}
