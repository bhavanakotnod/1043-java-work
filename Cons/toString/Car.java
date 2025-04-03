package Cons.toString;

public class Car {
	String brand;
	String name;
	String price;
	public Car(String brand,String name, String  price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [brand = " + brand + ", name = " + name + ", price = " + price + "]";
	}

	public static void main(String[] args) {
		Car c = new Car("Maruti Suzuki","Swift","6.49 L");
		System.out.println(c);
		System.out.println("-----------------");
		Car c1 = new Car("Tata","Punch","6.20L");
		System.out.println(c1);
	}

}
