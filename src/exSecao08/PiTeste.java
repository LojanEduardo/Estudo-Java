package exSecao08;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class PiTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		System.out.println("Enter Circumference: ");
		double circum = Calculator.circumference(radius);
		double vol = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circum);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}

}
