
public class Votingage {
	public static  void main(String args[])
	{
		int age = 37;           // using nested if - else
		if (age >= 18) {
			System.out.println("Right to Vote");
			
			if(age == 18) {
				System.out.println("Elligible to vote");
			}
		} else {
			System.out.println("Not Elligible");
		}
	}

}
