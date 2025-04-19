package abstraction;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("ALERT!" + "\n" + "100 daily data echausted as on 16- April-2025 20:30!");
		
	}

}
