package model;

public class Boat {
	
	private double engine;
	private int size;
	private String brand;
	/**
	 * superclass constructor - no arg default
	 */
	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}
	/** constructor passing arg
	 * @param engine
	 * @param size
	 * @param brand
	 */
	public Boat(double engine, int size, String brand) {
		super();
		this.engine = engine;
		this.size = size;
		this.brand = brand;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String makeNoise() {
		return "Welcome to the Love Boat <3";
			
	}
	
	

}


