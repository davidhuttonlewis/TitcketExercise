package ticketExercise.ticket;

import java.util.ArrayList;

public class Booking {

	private ArrayList<Integer> booking = new ArrayList<Integer>();
	
	public void addTicketToBooking(People people) {

		booking.add(people.getPrice());

	}

	public int getBookingSize() {
		return booking.size();
	}

	public int getTicketFromBooking(int index) {
		return booking.get(index);
	}

}
