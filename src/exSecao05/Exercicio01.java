package exSecao05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		double n1;
		String text;
		
		Scanner sc = new Scanner(System.in);
		Exercicios exe = new Exercicios();
		
		System.out.println("Entre com um valor: ");
		n1 = sc.nextDouble();
		
		text = exe.Negativo(n1);
		
		System.out.println(text);
		
		sc.close();
	}

}
