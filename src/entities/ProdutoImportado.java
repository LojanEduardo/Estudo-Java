package entities;

public class ProdutoImportado extends Produto2 {
	
	private Double customsFee;
	
	public ProdutoImportado() {
		super();
	}
	
	public ProdutoImportado(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return name + " $ " + totalPrice() + " Customs fee: $ " + customsFee;
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	
}
