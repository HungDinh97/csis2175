package purchase;

import java.util.Scanner;

public class CreatePurchase {

	static Scanner sc = new Scanner(System.in);
	
	private static int intCheck() {
		int input = 0;
		boolean check = false;
		while(!check) {
			if(sc.hasNextInt()) {
				input = sc.nextInt();
				check = true;
				return input;
			} else {
				System.out.print("Please enter an integer value: ");
			}
			sc.next();
		}
		return input;
	}
	
	private static double doubleCheck() {
		double input = 0;
		boolean check = false;
		while(!check) {
			if(sc.hasNextInt()) {
				input = sc.nextDouble();
				check = true;
				return input;
			} else {
				System.out.print("Please enter an number value: ");
			}
			sc.next();
		}
		return input;
	}
	
	private static int checkNegative(int n) {
		while(n<0) {
				System.out.print("Please enter a number larger ");
				n = intCheck();
		}
		return n;
	}
	public static void main(String args[]) {
		
		Purchase pc = new Purchase();
		int invoiceNumber = setInvoiceNumber();
		double amountOfSale = setAmountOfSale();
		
		pc.setInvoiceNumber(invoiceNumber);
		pc.setAmountOfSale(amountOfSale);
		
		pc.displayDetail(invoiceNumber, amountOfSale);
		
		
	}
	
	public static int setInvoiceNumber(){
		System.out.println("Enter Invoice Number:");
		int n = sc.nextInt();
		while(n<1000 || n>8000) {
			System.out.println("Invalid number, Invoice number should be between 1000 and 8000! ");
			System.out.println("Enter Invoice Number: ");
			n = sc.nextInt();
			if(n>1000 && n<8000) {
				break;
			}
		}
		return n;
	}
	
	public static double setAmountOfSale(){
		System.out.println("Enter Amount of Sale:");
		return sc.nextDouble();
	}
}
