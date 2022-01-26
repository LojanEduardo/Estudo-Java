package exSecao06;

import java.util.Scanner;

public class ExercicioFor04 {

	public static void main(String[] args) {
		double n;
		double n1;
		double n2;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Entre com um valor: ");
		n = sc.nextDouble();
		
		for(int i=0;i < n;i++) {
			
			System.out.println("Entre com um valor: ");
			n1 = sc.nextDouble();		
			System.out.println("Entre com outro valor: ");
			n2 = sc.nextDouble();	
				
			if(n2 == 0) {
				System.out.println("Divisão Impossivel");
			}else {
				System.out.println(n1/n2);
			}
		}
		
		sc.close();

	}

}
