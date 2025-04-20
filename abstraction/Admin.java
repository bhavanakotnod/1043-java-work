package abstraction;

public class Admin implements Login {
//
//	@Override
//	public void login() {
//		System.out.println("Admin Class....");
//	}

	@Override
	public boolean authenticate(String username, String password) {
		if (username.equals("Bhavana") && password.equals("Bahavana@123")) {
			System.out.println("Successfully Login");
			return true;
		} else {
			System.out.println("Invalid Credentials");
			return false;
		}

	}

}



