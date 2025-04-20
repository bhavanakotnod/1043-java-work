package abstraction;

public class User implements Login{



	public boolean authenticate(String username, String password) {
		if (username.equals("Baswa") && password.equals("Baswa@123")) {
			System.out.println("Successfully Login");
			return true;
		} else {
			System.out.println("Invalid Credentials");
			return false;
		}
	}

	

}
