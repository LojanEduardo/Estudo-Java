package exSecao04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int n1 = 0;
		double n2 = 0;
		double n3 = 0;
		
		Exercicios exe = new Exercicios();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		n1 = sc.nextInt();
		System.out.println("Entre com um valor: ");
		n2 = sc.nextDouble();
		System.out.println("Entre com um valor: ");
		n3 = sc.nextDouble();
		
		System.out.println("");
		
		System.out.println("NUMBER = " + n1);
		double result = exe.CalculaSalario(n2, n3);
		System.out.println("SALARY = " + result);
		
		sc.close();	
	}

}
