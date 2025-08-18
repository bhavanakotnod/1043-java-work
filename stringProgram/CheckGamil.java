package stringProgram;
//take email as a input from user
// check it has a Gmail or Yahoo
import java.util.Scanner;
public class CheckGamil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//take email from user side 
		System.out.println("Enter a email.....");
		String email = sc.nextLine();
		
		if(email.endsWith("@gmail.com")) {
			System.out.println("This is email address");
		}else if(email.endsWith("@yahoo.com")) {
			System.out.println("This is yahoo address");
		}else {
			System.out.println("this is nither a from Gmail.nor from Yahoo");
		}
		
		// 2nd method to check the email contains gmail or yahoo
		
		if(email.contains("gmail")) {
			System.out.println("Gmail address");
		}else if(email.contains("yahoo")) {
			System.out.println("yahoo address");
		}else {
			System.out.println("nither gmail nor yahoo");
		}
	}

}
