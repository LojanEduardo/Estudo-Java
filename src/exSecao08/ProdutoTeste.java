package exSecao08;

import java.util.Scanner;

import entities.Product;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com o nome do produto: ");
		String Name = sc.next();
		System.out.println("Entre com o valor dele: ");
		double Price = sc.nextDouble();
		System.out.println("Entre com a quantidade de produtos em estoque: ");
		int Quantity = sc.nextInt();
		
		Product pro = new Product(Name, Price, Quantity);
		
		System.out.println(pro);
		pro.addProduct(5);
		System.out.println(pro);
		pro.RemoveProducts(3);
		System.out.println(pro);
		
	}

}
