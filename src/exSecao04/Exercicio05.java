package exSecao04;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		double n3 = 0;
		
		int num1 = 0;
		int num2 = 0;
		double num3 = 0;
		
		Exercicios exe = new Exercicios();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o c�digo do primeiro produto:");
		n1 = sc.nextInt();
		
		System.out.println("Entre com a quantidade pe�as:");
		n2 = sc.nextInt();
		
		System.out.println("Entre com pre�o desta pe�a:");
		n3 = sc.nextDouble();
		
		System.out.println("Entre com o c�digo do segundo produto:");
		num1 = sc.nextInt();
		
		System.out.println("Entre com a quantidade pe�as:");
		num2 = sc.nextInt();
		
		System.out.println("Entre com pre�o desta pe�a:");
		num3 = sc.nextDouble();
		
		double resul = exe.CalculaValoraPagar(n2, n3, num2, num3);
		
		System.out.printf("Valor a pagar : R$ %.2f" , resul);
		
		sc.close();
	}

}
