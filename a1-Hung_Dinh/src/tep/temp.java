package tep;

public class temp {

	private double ftemp;
	public double getFtemp() {
		ctemp(ftemp);
		ktemp(ftemp);
		return ftemp;
	}

	public void setFtemp(double ftemp) {
		this.ftemp = ftemp;
	}

	private double ctemp;
	private double ktemp;
	
	public temp(double ftemp) {
		this.ftemp = ftemp;
	}
	
	public void ctemp(double ftemp) {
		ctemp = ftemp-32;
		System.out.println(ctemp);
	}
	public void ktemp(double ftemp) {
		ktemp =  ftemp+32;
		System.out.println(ktemp);
	}
	
	
}
