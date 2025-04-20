package abstraction;

public class VehicleEngine {
	public static void main(String[] args) {
		System.out.println(" bike start engie.........");
		Bike b = new Bike();
		b.startEngine();
		System.out.println("Car start engine............");
		Car c = new Car();
		c.startEngine();
		System.out.println("Truck start engine............");
		Truck t =new Truck();
		t.startEngine();
	}

}
