package purchase;

public class Purchase {
	private int invoiceNumber;
	private double amountOfSale;
	private double amountOfSaleTax;
	
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public double getAmountOfSale() {
		return amountOfSale;
	}
	public void setAmountOfSale(double amountOfSale) {
		this.amountOfSale = amountOfSale;
		this.amountOfSaleTax = amountOfSale*0.05;
	}
	public double getAmountOfSaleTax() {
		return amountOfSaleTax;
	}
	
	public void displayDetail(int invoiceNumber, double amountofSale) {
		System.out.println("Invoice Number: " + invoiceNumber);
		System.out.println("Amount of Sale: $" + amountofSale);
		System.out.println("Amount of Sale Tax: $" + getAmountOfSaleTax());
	}
	
	
}
