package stringProgram;
import java.util.Scanner;
public class VowelConsonent {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a any string");
		String input =sc.nextLine().toLowerCase();
		
		int vowel = 0;
		int consonent =0;
		
		for(int i =0;i<input.length();i++) {
			String ch =input.substring(i, i+1);
			if(ch.matches("[a-z]")) {
				if(ch.equals("a") || ch.equals("e")|| ch.equals("i")|| ch.equals("o")||ch.equals("u")) {
					vowel++;
					
				}
				else {
					consonent++;
					
				}
			}
		}
		System.out.println("number of vowel :"+vowel);
		System.out.println("number of consonent :"+consonent);
	}

}
