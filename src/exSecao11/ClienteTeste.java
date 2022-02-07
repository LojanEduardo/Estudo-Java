package exSecao11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Cliente;
import entities.Ordem;
import entities.OrdemItem;
import entities.Produto;
import entities.enums.OrdemStatus;

public class ClienteTeste {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			
		System.out.println("Entre com as informações do cliente: ");
		System.out.println("Name: ");
		String nome = sc.next();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Data de nascimento(DD/MM/YYYY): ");
		String data = sc.next();
		
		System.out.println("Entre com as informações do pedido: ");
		System.out.println("Status: ");
		String status = sc.next();
		System.out.println("Quantos itens tem neste pedido: ");
		int itens = sc.nextInt();
		
		Cliente cli = new Cliente(nome, email, sdf1.parse(data));
		
		Ordem pedido = new Ordem(OrdemStatus.valueOf(status), cli);
		
		for(int i = 1; i <= itens; i++) {
			System.out.println("Produto número #" + i);
			System.out.println("Nome do Produto: ");
			String nomeProduto = sc.next();
			System.out.println("Preço do Produto: ");
			double preco = sc.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			
			Produto pro = new Produto(nomeProduto, preco);
			OrdemItem pedidoItem = new OrdemItem(quantidade, pro);
			
			pedido.addItem(pedidoItem);
		}
		
		
		
		System.out.println(pedido);
	}

}
