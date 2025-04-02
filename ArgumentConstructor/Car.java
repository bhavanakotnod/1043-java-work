package ArgumentConstructor;

public class Car {
	public Car(String brand,String name, String  price) {
		System.out.println("Car brand "+ brand);
		System.out.println("Car name "+ name);
		System.out.println("Car price "+ price);
	}
	public static void main(String[] args) {
		Car c = new Car("Maruti Suzuki","Swift","6.49 L");
		System.out.println("-----------------");
		Car c1 = new Car("Tata","Punch","6.20L");
	}

}
