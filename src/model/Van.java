package model;

public class Van 
{
	private String color;
	private String brand;
	private double miles;
	
	public Van() {
		super();
	}
	
	public Van(String color, String brand, double miles) {
		super();
		this.color = color;
		this.brand = brand;
		this.miles = miles;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getMiles() {
		return miles;
	}
	public void setMiles(double miles) {
		this.miles = miles;
	}
	
	public String makeNoise()
	{
		return "Boop! Boop!";
	}
	
}
