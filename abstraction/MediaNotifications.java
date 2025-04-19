package abstraction;

public class MediaNotifications {
	public static void main(String[] args) {
		System.out.println("email notification.........");
		EmailNotification e = new EmailNotification();
		e.notifyUser();
		System.out.println("SMS notification........");
		SMSNotification s= new SMSNotification();
		s.notifyUser();
		System.out.println("push notificatio...............");
		PushNotification p = new PushNotification();
		p.notifyUser();
		
	} 
	

}
