package carlyCatering;
import java.util.Scanner;

public class EventDemo {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
	//
		Event obj1 = new Event();
		String obj1EventNumber = obj1.getEventNumber();
		int obj1GuestNumber = obj1.getGuestNumber();
		int obj1Price = obj1.getPrice();
		
		displayValue(obj1EventNumber, obj1GuestNumber, obj1Price);
		
		String eventNumber = setEventNumber();
		int guestNumber = setGuest();
		
		Event obj2 = new Event(eventNumber, guestNumber);
		
		String obj2EventNumber = obj2.getEventNumber();
		int obj2GuestNumber = obj2.getGuestNumber();
		int obj2Price = obj2.getPrice();
		
		displayValue(obj2EventNumber, obj2GuestNumber, obj2Price);
		
	}
	
	public static String setEventNumber() {
		System.out.println("Enter the Event Number: ");
		return sc.nextLine();
	}
	
	public static int setGuest() {
		System.out.println("Enter the Guest Number: ");
		return sc.nextInt();
	}
	
	public static void displayValue(String eventNumber, int guestNumber, int price) {
		System.out.println("Event Number: " + eventNumber);
		System.out.println("Guest Number: " + guestNumber);
		System.out.println("Price: $" + price);
		System.out.println("");
	}
}
