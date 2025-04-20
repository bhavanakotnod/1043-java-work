package abstraction;

public class LoginDashboard {
	public static void main(String[] args) {
		System.out.println("ADMIN PORTAL");
		Admin a = new Admin();
		a.authenticate("Ram", "Ram@123");
		
		System.out.println("---------------------");
		
		System.out.println("USER PORTAL");
		User u = new User();
		u.authenticate("Baswa", "Baswa@123");
	}


}
