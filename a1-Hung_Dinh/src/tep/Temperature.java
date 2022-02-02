package tep;
public class Temperature {
private double ftemp;
private double celsius;
private double kelvin;


public double getFarenheit() {
	System.out.println("Farenheit: " + ftemp);
	toKelvin(ftemp);
	toCelsius(ftemp);
	return ftemp;
}

public Temperature(double ftemp) {
	this.ftemp = ftemp;
}
public void toCelsius(double ftemp) {
	celsius = (5/(double)9)*(ftemp-32);
	System.out.println("Celsius: " + celsius);
}
public void toKelvin(double ftemp) {
	kelvin = ((5/(double)9)*(ftemp-32)+273);
	System.out.println("Kelvin: " + kelvin);
}


}
