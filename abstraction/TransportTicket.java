package abstraction;

public class TransportTicket {
	public static void main(String[] args) {
		Transport t;

		t = new Bus();
		t.bookTicket();

		t = new Train();
		t.bookTicket();

		t = new Flight();
		t.bookTicket();
	}

}
