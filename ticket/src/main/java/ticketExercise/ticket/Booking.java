package ticketExercise.ticket;

import java.util.ArrayList;

public class Booking {

	private ArrayList<Integer> booking = new ArrayList<Integer>();
	private Ticket ticket = new Ticket();

	public void addTicketToBooking(String ticketType) {

		booking.add(ticket.ticketPrice(ticketType));

	}

	public int getBookingSize() {
		return booking.size();
	}

	public int getTicketFromBooking(int index) {
		return booking.get(index);
	}

}
