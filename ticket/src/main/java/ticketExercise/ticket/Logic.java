package ticketExercise.ticket;

public class Logic {


	int totalBookingCost(Booking booking) {

		int bookingCost = 0;
		for (int i = 0; i < booking.getBookingSize(); i++) {

			bookingCost += booking.getTicketFromBooking(i);
		}
		
//		if (isWednesday) {
//			bookingCost -= 2 * booking.getBookingSize();
//		}

		return bookingCost;

	}
	
	int deals(Day day, int booking, int ticketNumber) {
		
		switch (day) {
		case WEDNESDAY: return booking -= (2 * ticketNumber);
		
		default: return booking;
	}
	}

}
