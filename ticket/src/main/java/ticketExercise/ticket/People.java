package ticketExercise.ticket;

public enum People {
	STANDARD(8), OAP(6), STUDENT(6), CHILD(4);
	
	private int price;
	private People(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
}
