package ticketExercise.ticket;

import org.junit.Test;

public class TestCase extends junit.framework.TestCase {

	@Test
	public void testTicketPriceStudent() {
		Ticket t1 = new Ticket();
		assertEquals(6, t1.ticketPrice("student"));
	}

	@Test
	public void testTicketPriceOAP() {
		Ticket t1 = new Ticket();
		assertEquals(6, t1.ticketPrice("oap"));
	}

	@Test
	public void testTicketPriceStandard() {
		Ticket t1 = new Ticket();
		assertEquals(8, t1.ticketPrice("standard"));
	}
	
	@Test
	public void testTicketPriceChild() {
		Ticket t1 = new Ticket();
		assertEquals(4, t1.ticketPrice("child"));
	}
	
	@Test
	public void testTicketPriceInvalid() {
		Ticket t1 = new Ticket();
		assertEquals(0, t1.ticketPrice("gjhgjhg"));
	}

	@Test
	public void testTotalPrice() {

		Booking booking = new Booking();
		Logic logic = new Logic();

		booking.addTicketToBooking("student");
		booking.addTicketToBooking("standard");

		assertEquals(14, logic.totalBookingCost(booking));
	}
	
	@Test
	public void testPriceDeal() {
		Booking booking = new Booking();
		Logic logic = new Logic();

		booking.addTicketToBooking("student");
		booking.addTicketToBooking("standard");
		
		assertEquals(14, logic.deals(Day.WEDNESDAY,logic.totalBookingCost(booking)));
	}
	
//	@Test
//	public void testUserEntry() {
//
//		//userInerface.userEntry("student");
//		//userInerface.userEntry("student");
//		
//		
//	}
//	

}
