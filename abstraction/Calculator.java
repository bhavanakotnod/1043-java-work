package abstraction;

public class Calculator implements Arithmetic {
	
	

	@Override
	public void add(int a,int b) {
		int c = a+b;
		System.out.println("Adding two number "+ c);
		
	}

	@Override
	public void sub(int a,int b) {
		int c= a-b;
		System.out.println("Substitution of two number  "+c);
		
	}

	@Override
	public void multi(int a, int b) {
		int c = a*b;
		System.out.println("multiplication of two number "+ c);
		
	}

	@Override
	public void div(int a, int b) {
		int c =a/b;
		System.out.println("division of two number  "+c);
		
	}
public static void main(String[] args) {
		Calculator c =new Calculator();
		c.add(23, 12);
		c.sub(12, 5);
		c.multi(5, 8);
		c.div(16, 4);
	}

}
