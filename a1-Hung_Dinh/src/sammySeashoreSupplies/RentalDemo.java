package sammySeashoreSupplies;
//importing Scanner
import java.util.Scanner;

public class RentalDemo {
	
	// creating scanner object
	static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
	    
	    // creating default Rental object 
	    Rental obj1 = new Rental();
	    
	    // calling method for obj1 and stored its values  
	    String obj1ContractNum = obj1.getContractNumber();
	    int obj1RentalHour = obj1.getRentalHour();
	    int obj1RentalMinute = obj1.getRentalMinute();
	    int obj1Price = obj1.getPrice();
	    	
	    //display values of obj1
	    displayDetails(obj1ContractNum, obj1RentalHour, obj1RentalMinute, obj1Price);
	    	
	    String contract = setContract();
	    int hoursAndMinutes = setMinute();
	    
	    // creating new Rental object 2 
	    Rental obj2 = new Rental(contract,hoursAndMinutes);
	    
	    // calling method for obj2 and stored its values  
	    String obj2ContractNum = obj2.getContractNumber();
		int obj2RentalHour = obj2.getRentalHour();
		int obj2RentalMinute = obj2.getRentalMinute();
		int obj2Price = obj2.getPrice();
		
		//display values of obj2
		displayDetails(obj2ContractNum, obj2RentalHour, obj2RentalMinute, obj2Price);
    
    }
    
    //get contract number from user
    public static String setContract() {
    	System.out.println("Enter contract number: ");
    	return sc.nextLine();
    } 
    
    //get rent minutes from user
    public static int setMinute() {
    	System.out.println("Enter the minutes: ");
    	return sc.nextInt();
    } 
    
  //display values of object
    public static void displayDetails(String contract, int hours, int minutes, int price){
        System.out.println("Contract Number: " + contract);
        System.out.println("Number of hours: " + hours);
        System.out.println("Number of minutes: " + minutes);
        System.out.println("Total price: $" + price);
        System.out.println();
    }
}
