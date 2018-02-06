package ticketExercise.ticket;

public class Ticket {

	public int ticketPrice(String ticketType) {

		switch (ticketType) {
		case "standard":
			return 8;
		case "oap":
			return 6;
		case "student":
			return 6;
		case "child":
			return 4;
		default:
			return 0;

		}

	}
}
