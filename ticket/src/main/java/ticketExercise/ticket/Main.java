package ticketExercise.ticket;

public class Main {

	public static void main(String[] args) {

		Booking booking = new Booking();
		Logic logic = new Logic();

		booking.addTicketToBooking("student");
		booking.addTicketToBooking("standard");

		System.out.println(logic.totalBookingCost(booking));
		

	}

}
