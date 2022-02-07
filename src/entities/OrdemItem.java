package entities;

import java.text.SimpleDateFormat;

public class OrdemItem {
	private int quantidade;
	private double price;
	private Produto produto;		
	
	public OrdemItem() {
		
	}
	
	public OrdemItem(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.price = produto.getPrice();
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double totalPedido() {
		return quantidade*price;
	}
}
