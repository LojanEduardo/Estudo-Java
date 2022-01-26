package exSecao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		double n1;
		String text;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Exercicios exe = new Exercicios();
		
		System.out.println("Entre com um intervalo: ");
		n1 = sc.nextDouble();
		
		text = exe.Intervalo(n1);
		
		System.out.println(text);
		
		sc.close();

	}

}
