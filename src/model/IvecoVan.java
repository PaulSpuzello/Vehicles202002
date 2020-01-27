package model;

public class IvecoVan 
{
	private int seats;
	private double gasLeft;
	private boolean automaticDoor;
	
	public IvecoVan() {
		super();
	}
	
	public IvecoVan(int seats, double gasLeft, boolean automaticDoor) {
		super();
		this.seats = seats;
		this.gasLeft = gasLeft;
		this.automaticDoor = automaticDoor;
	}

	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public double getGasLeft() {
		return gasLeft;
	}
	public void setGasLeft(double gasLeft) {
		this.gasLeft = gasLeft;
	}
	public boolean getAutomaticDoor() {
		return automaticDoor;
	}
	public void setAutomaticDoor(boolean automaticDoor) {
		this.automaticDoor = automaticDoor;
	}
	
	public String makeNoise() {
		return "BOOP! BOOP!"; 
	}
	


}


