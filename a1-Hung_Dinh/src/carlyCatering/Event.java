package carlyCatering;

public class Event {
	public final static int pricePerGuest = 35;
	public final static int gusetLimit =50;
	
	private String eventNumber;
	private int guestNumber;
	private int price;
	
	public Event(String eventNumber, int guestNumber) {
		setEventNumber(eventNumber);
		setGuest(guestNumber);
	}
	public Event() {
		this("A000",0);
	}
	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}
	
	public void setGuest(int guestNumber) {
		this.guestNumber = guestNumber;
		if(guestNumber >gusetLimit) {
			System.out.println("Guest Number must be under 50 people!");
		}else {
			price = guestNumber*pricePerGuest;
		}
	}

	
	public int getGuestNumber() {
		return guestNumber;
	}
	
	public int getPrice() {
		return price;
	}

	public String getEventNumber() {
		return eventNumber;
	}
	
	
}
