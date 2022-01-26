package exSecao05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		double n1;
		double n2;
		String text;
		
		Scanner sc = new Scanner(System.in);
		Exercicios exe = new Exercicios();
		
		System.out.println("Entre com valor de x: ");
		n1 = sc.nextDouble();
		System.out.println("Entre com valor de y: ");
		n2 = sc.nextDouble();
		
		text = exe.Eixos(n1, n2);
		
		System.out.println(text);
		
		sc.close();
	}

}
