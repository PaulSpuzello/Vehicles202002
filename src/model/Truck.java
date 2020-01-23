package model;

//added by Ricky

public class Truck {
	private String brand;
	private int year;
	private String transmission;

	public Truck() {
		super();
	}

	public Truck(String b, int y, String t) {
		super();
		this.brand = b;
		this.year = y;
		this.transmission = t;
	}

	public String makeNoise() {
		return "Hownk.";
	}
}
