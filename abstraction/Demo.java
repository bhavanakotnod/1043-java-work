package abstraction;

public class Demo implements Printable, Showable {

	@Override
	public void display(int num) {
		System.out.println("print a number");
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}

	}

	@Override
	public void display(String name) {
		System.out.println("Diplay message........ " + name);

	}

}
