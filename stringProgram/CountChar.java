package stringProgram;
//accept the name of the user
//count the number of character in it
public class CountChar {
	public static void main(String[] args) {
		String s ="Bhavana";
		System.out.println("number of character in string : " +s.length());
		
		// count the number of digit in password
		String password = "Bhavana@123";
		int digit_count = 0;
		for(int i =0;i<password.length();i++) {
			if(Character.isDigit(password.charAt(i)))
					{
				digit_count ++;
				
			}
		}
		System.out.println("number of digit in password "+ digit_count);
		
		
	}

}
