package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrdemStatus;

public class Ordem {
	private Date momento;
	private OrdemStatus status;
	private Cliente cliente;
	
	private List<OrdemItem> ordemItens = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Ordem(OrdemStatus status, Cliente cliente) {
		this.momento = new Date();
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrdemItem> getOrdemItem() {
		return ordemItens;
	}

	public void addItem(OrdemItem ordemItem) {
		ordemItens.add(ordemItem);
	}
	
	public void removeItem(OrdemItem ordemItem) {
		ordemItens.remove(ordemItem);
	}
	
	public Double total() {
		double sum = 0;
		
		for(OrdemItem c : ordemItens) {
			sum += c.totalPedido();
		}
		
		return sum;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("ORDER SUMMARY: \n")
		.append("Order momment: ")
		.append(sdf1.format(momento))
		.append("\n")
		.append("Order status: ")
		.append(status)
		.append("\n")
		.append("Client: ")
		.append(cliente.getName())
		.append(" ")		
		.append(sdf.format(cliente.getDataAniver()))
		.append(" - ")
		.append(cliente.getEmail())
		.append("\nOrder Itens:\n");
		for(OrdemItem c : ordemItens) {
			str.append(c.getProduto().getName())
			.append(", $")
			.append(c.getProduto().getPrice())
			.append(", ")
			.append("Quantity: ")
			.append(c.getQuantidade())
			.append(", Subtotal: $")
			.append(c.totalPedido())
			.append("\n");
		}
		str.append("Total price: $")
		.append(total());
		
		return str.toString();
	}
}
