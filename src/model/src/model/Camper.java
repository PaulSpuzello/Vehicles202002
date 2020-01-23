package model;

public class Camper {

	public int year;
	public String brand;
	public int seating;
	
	public Camper() {
		super();
	}

	public Camper(int year, String brand, int seating) {
		super();
		this.year = year;
		this.brand = brand;
		this.seating = seating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSeating() {
		return seating;
	}

	public void setSeating(int seating) {
		this.seating = seating;
	}
	
	public String makeNoise() {
		
		return "Honk! Honk!";
	}
}
