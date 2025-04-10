package Mock.jbk;

public class Evenodd {
	
	public static void main(String[] args) {
		Evenodd.checkNature(87);
	}

	public static void checkNature(int a) {

		if (a % 2 == 0) {
			System.out.println("the given number is the even number");
		} else {
			System.out.println("the given number is the odd number");
		}
	}

	
}
