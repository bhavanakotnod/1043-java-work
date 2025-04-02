package ArgumentConstructor;

public class Laptop {
	public Laptop(String brand,String ram, String storage) {
		System.out.println("Laptop brand "+ brand);
		System.out.println("Laptop ram "+ ram);
		System.out.println("Laptop storage "+ storage);
	}
	public static void main(String[] args) {
		Laptop l = new Laptop("HP","8 GB","512 GB");
		System.out.println("------------------");
		Laptop lap = new Laptop("Asus","8 GB","1 TB");
	}

}
