package model;

public class Airplane {
	
	private double fuelInGallons;
	private String airline;
	private String pilotCommand;
	
	public Airplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airplane(double fuelInGallons, String airline, String pilotCommand) {
		super();
		this.fuelInGallons = fuelInGallons;
		this.airline = airline;
		this.pilotCommand = pilotCommand;
	}

	public double getFuelInGallons() {
		return fuelInGallons;
	}

	public void setFuelInGallons(double fuelInGallons) {
		this.fuelInGallons = fuelInGallons;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getPilotCommand() {
		return pilotCommand;
	}

	public void setPilotCommand(String pilotCommand) {
		this.pilotCommand = pilotCommand;
	}
	
	public String makeNoise() {
		return "We're about to take off!";
			
	}

	
}
