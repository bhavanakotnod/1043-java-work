package abstraction;

public class FlightService implements Booking,Cancellation,TicketStatus{
	String passangerName;
	String flightTicket;
	String ticketId;
	
	public void bookTicket(String passangerName, String flightNumber) {
		this.passangerName = passangerName;
		this.flightTicket = flightNumber;
		 
		System.out.println("Ticket booked for "+ passangerName+"  on flight " +flightNumber);
		
	}

	

	@Override
	public void cancelTicket(String ticketId) {
		this.ticketId = ticketId;
		if(this.ticketId != null ) {
			
			System.out.println("Ticket " + ticketId + " has been cancelled.");
		}else {
			System.out.println("Invalid ticket id, cannot match");
		}
	}
	@Override
	public void checkStatus(String ticketId) {
		this.ticketId = ticketId;
		if(ticketId != null) {
			System.out.println("Status of ticket "+ ticketId + " : " +"cancelled");
		}else {
			System.out.println("ticket id not found");
		}
		
		
	}
	public static void main(String[] args) {
		FlightService service = new FlightService();
		service.bookTicket("Bhavana", "AI2025");
		service.cancelTicket("TKA0867");
		
		service.checkStatus(service.ticketId);
		
	}

	
	
	

	

}
