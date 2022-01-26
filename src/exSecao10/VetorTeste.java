package exSecao10;

import java.util.Scanner;

import entities.Product;

public class VetorTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
						
		int n = sc.nextInt();	
		Product[] vet = new Product[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Entre com nome do produto: ");
			String name = sc.next();
			System.out.println("Entre com preço do produto: ");
			double price = sc.nextDouble();
			
			vet[i] = new Product(name, price);
		}
		
		double sum = 0;
		
		for(int i=0; i<vet.length;i++) {
			sum += vet[i].getPrice();
		}
		
		double avg = sum/vet.length;
		
		System.out.println("Preço médio = "+avg);
		
		
		sc.close();
	}

}
