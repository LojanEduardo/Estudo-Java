package exSecao05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		double n1;
		double n2;
		String text;
		
		Scanner sc = new Scanner(System.in);
		Exercicios exe = new Exercicios();
		
		System.out.println("Entre com um valor: ");
		n1 = sc.nextDouble();
		System.out.println("Entre com outro valor: ");
		n2 = sc.nextDouble();
		
		text = exe.SaoMultiplos(n1, n2);
		
		System.out.println(text);
		
		sc.close();
	}

}
