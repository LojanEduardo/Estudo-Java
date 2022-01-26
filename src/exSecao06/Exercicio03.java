package exSecao06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int contA = 0;
		int contG = 0;
		int contD = 0;

		String text;
		
		Scanner sc = new Scanner(System.in);
			
		while(n1 != 4) {
			System.out.println("Entre com o código: ");
			n1 = sc.nextInt();
			switch (n1) {
			case 1:
				contA++;
				break;
			case 2:
				contG++;
				break;
			case 3:
				contD++;
				break;
			default:
				break;
			}
		}
		
		System.out.println("Muito Obrigado\nAlcool: "+contA+"\nGasolina: " + contG + "\nDiesel: " + contD);
		sc.close();
	}

}
