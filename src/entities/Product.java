package entities;

public class Product implements Comparable<Product>{
	private String Name;
	private Double Price;
	private int Quantity;
	
	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		this.Name = name;
		this.Price = price;
		this.Quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.Name = name;
		this.Price = price;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public double getPrice() {
		return Price;
	}
	
	public void setPrice(double price) {
		this.Price = price;
	}
	
	public int getQuantity() {
		return Quantity;
	}
	
	public double TotalValueInStock() {
		return Price * Quantity;
	}
	
	public void addProduct(int quantity) {
		this.Quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.Quantity -= quantity;
	}
	
	public String toString() {
		return  Name 
				+ ", " 
				+ String.format("%.2f", Price);
	}

	@Override
	public int compareTo(Product o) {		
		return Price.compareTo(o.getPrice());
	}
}
