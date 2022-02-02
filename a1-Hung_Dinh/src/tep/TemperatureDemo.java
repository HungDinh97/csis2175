package tep;

import java.util.Scanner;

public class TemperatureDemo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the temperature: ");
		double ftemp = sc.nextDouble();
		Temperature temp = new Temperature(ftemp);
		temp.getFarenheit();
		
	}
}
