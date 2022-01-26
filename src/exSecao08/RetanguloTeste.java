package exSecao08;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class RetanguloTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.println("Entre com a largura do triangulo: ");
		rec.width = sc.nextDouble();
		System.out.println("Entre com a altura do triangulo: ");
		rec.height = sc.nextDouble();
		
		System.out.println(rec);
		
	}

}
