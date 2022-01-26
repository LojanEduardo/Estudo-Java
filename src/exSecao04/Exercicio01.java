package exSecao04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Exercicios exe = new Exercicios();
		
		double n1 = 0;
		double n2 = 0;
			
		System.out.println("Entre com uma valor:");
		n1 = sc.nextDouble();
		System.out.println("Entre com outro valor:");
		n2 = sc.nextDouble();
		
		double b = exe.Somar(n1, n2);
		
		System.out.println("A soma dos valores é " + b);
			
		sc.close();
	}

}
