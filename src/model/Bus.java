package model;

public class Bus {

	private String make;
	private String model;
	private int seatCount;
	
	/**
	 * Default no-arg constructor
	 */
	public Bus() {
		super();
	}
	
	/** Non-default constructor
	 * @param make
	 * @param model
	 * @param seatCount
	 */
	public Bus(String make, String model, int seatCount) {
		super();
		this.make = make;
		this.model = model;
		this.seatCount = seatCount;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	public String makeNoise() {
		return "Honk Honk Hooooonk!";
			
	}
	
}
