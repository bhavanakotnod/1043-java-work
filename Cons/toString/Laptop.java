package Cons.toString;

public class Laptop {
	String brand;
	String ram;
	String storage;
	public Laptop(String brand,String ram, String storage) {
		this.brand = brand;
		this.ram =ram;
		this.storage = storage;
	}
	
	
	@Override
	public String toString() {
		return "Laptop [brand = " + brand + ", ram = " + ram + ", storage = " + storage + "]";
	}


	public static void main(String[] args) {
		Laptop l = new Laptop("HP","8 GB","512 GB");
		System.out.println(l);
		System.out.println("------------------");
		Laptop lap = new Laptop("Asus","8 GB","1 TB");
		System.out.println(lap);
	}

}
