package stringProgram;
import java.util.Scanner;
public class InputFullName {
	public static void main(String[] args) {
		Scanner  sc= new Scanner(System.in);
		System.out.println("Enter  name");
		String name = sc.nextLine();
		//substring ignore index char 0,1 and 2 it prints from index 3
//		System.out.println(name.substring(3));
//		// it prints the output of index 5th number character
//		System.out.println(name.charAt(5));
//		//it prints the string after a 4 white spaces
//		System.out.println(name.indent(4));
//		System.out.println(name.hashCode());
//		// it prints the index of a in given string
//		System.out.println(name.indexOf("a"));
		// if nothing give any input then its give the true means is blank
		//
		//System.out.println(name.isBlank());
		
		System.out.println(name.isEmpty());
		
	}

}
