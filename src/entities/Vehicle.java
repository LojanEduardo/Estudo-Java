package entities;

public class Vehicle {
	private String modelString;
	
	public Vehicle() {
		
	}

	public Vehicle(String modelString) {
		super();
		this.modelString = modelString;
	}

	public String getModelString() {
		return modelString;
	}

	public void setModelString(String modelString) {
		this.modelString = modelString;
	}
	
}
