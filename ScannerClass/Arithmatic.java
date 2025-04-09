package ScannerClass;
import java.util.Scanner;
public class Arithmatic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter a first number");
	    int a = sc.nextInt();
	    
	    System.out.println("enter a second number");
	    int b = sc.nextInt();
	    
	    Arithmatic_operation add = new Arithmatic_operation();
	    add.addition(a,b);
	    
	    add.sub(a,b);
	    add.mul(a,b);
	    add.div(a,b);
	    
	    
	    
	}

}
