package exSecao05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int n1;
		double n2;
		String text;
		
		Scanner sc = new Scanner(System.in);
		Exercicios exe = new Exercicios();
		
		System.out.println("Entre com código do produto: ");
		n1 = sc.nextInt();
		System.out.println("Entre com a quantiade de pedidos: ");
		n2 = sc.nextDouble();
		
		text = exe.ValorTotal(n1, n2);
		
		System.out.println(text);
		
		sc.close();
	}

}
