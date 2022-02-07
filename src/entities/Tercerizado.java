package entities;

public class Tercerizado extends Funcionario{
	
	private Double additionalCharge;
	
	
	
	public Tercerizado(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return hours * valuePerHour + additionalCharge * 1.1;
	}
	
}
