package entities;

import java.util.Date;

public class ProdutoUsado extends Produto2{
	
	private Date manufactureDate;
	
	public ProdutoUsado() {
		super();
	}
	
	public ProdutoUsado(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return name + " (used) $ " + price + " Manufacture date: " + manufactureDate;
	}
	
	
	
}
