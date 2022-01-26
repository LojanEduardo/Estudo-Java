package exSecao04;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double n1 = 0;
		
		Exercicios exe = new Exercicios();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio: ");
		n1 = sc.nextDouble();
		
		double a = exe.AreaCirculo(n1);
		
		System.out.println("A area deste circulo é " + a );
		
		sc.close();
	}

}
