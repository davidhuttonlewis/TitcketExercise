package ticketExercise.ticket;

public class Logic {

	private int numberOfTickets = 0;

	int totalBookingCost(Booking booking) {

		int bookingCost = 0;
		for (int i = 0; i < booking.getBookingSize(); i++) {

			bookingCost += booking.getTicketFromBooking(i);
			numberOfTickets++;
		}
		
		return bookingCost;

	}
	
	int deals(Day day, int booking) {
		
		switch (day) {
		case WEDNESDAY: return booking -= (2 * numberOfTickets);
		
		default: return booking;
	}
	}

}
