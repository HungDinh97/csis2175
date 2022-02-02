package sammySeashoreSupplies;

public class Rental {
	public static final int minute = 60;
	public static final int hourRentfee = 40;
	
	private String contractNumber;
	private int rentalHour;
	private int rentalMinute;
	private int price;
	
	public Rental(String contractNumber, int hoursAndMinutes) {
		setContractNumber(contractNumber);
		setHoursAndMinutes(hoursAndMinutes);
	}
	public Rental() {
		this("A000", 0);
	}
	

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getContractNumber() {
		return contractNumber;
	}

	public void setHoursAndMinutes(int hoursAndMinutes) {
		rentalHour = hoursAndMinutes/minute;
		rentalMinute = hoursAndMinutes - rentalHour*minute;
		price = rentalHour*hourRentfee + rentalMinute*1;
	}
	
	public int getRentalHour() {
		return rentalHour;
	}


	public int getRentalMinute() {
		return rentalMinute;
	}


	public int getPrice() {
		return price;
	}
	
}
