package exSecao04;

import java.util.Locale;
import java.util.Scanner;

public class EstudoScanner {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		char a;
		
		//System.out.println("Entre com alguma valor: ");
		//x = sc.next();
		a = sc.next().charAt(0);
		System.out.println("Você digitou :" + a);
		
		//System.out.println("Você digitou: " + x);
		
		sc.close();
	}

}
