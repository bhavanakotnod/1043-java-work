package Cons.toString;

public class Mobile {
	String brand;
	String model;
	String price;
	
	public Mobile(String brand, String model,String price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Mobile [brand = " + brand + ", model = " + model + ", price = " + price + "]";
	}


	public static void main(String[] args) {
		Mobile m = new Mobile("Redmi mi","pro", "15K");
		System.out.println(m);
		System.out.println("----------------");
		Mobile m1 = new Mobile("Samsung Galaxy s23"," ultrapro", "19K");
		System.out.println(m1);
	}
}
