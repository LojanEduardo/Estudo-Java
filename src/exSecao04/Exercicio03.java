package exSecao04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double n4 = 0;
		
		Exercicios exe = new Exercicios();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		n1 = sc.nextDouble();
		System.out.println("Entre com um valor: ");
		n2 = sc.nextDouble();
		System.out.println("Entre com um valor: ");
		n3 = sc.nextDouble();
		System.out.println("Entre com um valor: ");
		n4 = sc.nextDouble();
		
		double resul = exe.CalculaDiferenca(n1, n2, n3, n4);
		
		System.out.println("O resultado foi :" + resul);
		
		sc.close();
	}

}
