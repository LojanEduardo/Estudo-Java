package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	
	private Date duelDate;
	private Double amount;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Installment() {
		
	}

	public Installment(Date duelDate, Double amount) {
		super();
		this.duelDate = duelDate;
		this.amount = amount;
	}

	public Date getDuelDate() {
		return duelDate;
	}

	public void setDuelDate(Date duelDate) {
		this.duelDate = duelDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return sdf.format(duelDate) + " - " + String.format("%.2f", amount);
	}
}
