package ticketExercise.ticket;

import org.junit.Test;

public class TestCase extends junit.framework.TestCase {

	@Test
	public void testTicketPriceStudent() {
		assertEquals(6, People.STUDENT.getPrice());
	}

	@Test
	public void testTicketPriceOAP() {
		assertEquals(6, People.OAP.getPrice());
	}

	@Test
	public void testTicketPriceStandard() {
		assertEquals(8, People.STANDARD.getPrice());
	}
	
	@Test
	public void testTicketPriceChild() {
		assertEquals(4, People.CHILD.getPrice());
	}
	
	@Test
	public void testTotalPrice() {

		Booking booking = new Booking();
		Logic logic = new Logic();

		booking.addTicketToBooking(People.STUDENT);
		booking.addTicketToBooking(People.STANDARD);

		assertEquals(14, logic.totalBookingCost(booking));
	}
	
	@Test
	public void testPriceDeal() {
		Booking booking = new Booking();
		Logic logic = new Logic();

		booking.addTicketToBooking(People.STUDENT);
		booking.addTicketToBooking(People.STANDARD);
		
		assertEquals(10, logic.deals(Day.WEDNESDAY,logic.totalBookingCost(booking)));
	}
	
}
