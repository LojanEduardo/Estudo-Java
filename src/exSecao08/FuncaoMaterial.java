package exSecao08;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class FuncaoMaterial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Exercicios exe = new Exercicios();
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com valores do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com valores do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double AreaX = x.CalculaAreaTriangulo();
		double AreaY = y.CalculaAreaTriangulo();
		
		System.out.println("A area do triangulo X :" + AreaX);
		System.out.println("A area do triangulo Y :" + AreaY);
		
		if(AreaX > AreaY) {
			System.out.println("O triangulo X tem a maior area.");
		}else {
			System.out.println("O triangulo Y tem a maior area.");
		}
		sc.close();
	}

}
