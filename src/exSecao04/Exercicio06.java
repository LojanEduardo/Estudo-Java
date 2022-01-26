package exSecao04;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Exercicios exe = new Exercicios();
		
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
			
		System.out.println("Entre com um valor:");
		n1 = sc.nextDouble();
		System.out.println("Entre com um valor:");
		n2 = sc.nextDouble();
		System.out.println("Entre com um valor:");
		n3 = sc.nextDouble();
		
		double resul = exe.CalculaAreaTriangulo(n1, n3);
		System.out.printf("TRIANGULO: %.3f%n", resul);
		resul = exe.AreaCirculo(n3);
		System.out.printf("CIRCULO: %.3f%n", resul);
		resul = exe.CalculaTrapezio(n1, n2, n3);
		System.out.printf("TRAPEZIO: %.3f%n", resul);
		resul = exe.CalculaAreaQuadrado(n2);
		System.out.printf("QUADRADO: %.3f%n", resul);
		resul = exe.CalculaAreaRetangulo(n1, n2);
		System.out.printf("RETANGULO: %.3f%n", resul);
		
		sc.close();
	}

}
