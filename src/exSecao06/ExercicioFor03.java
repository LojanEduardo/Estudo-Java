package exSecao06;

import java.util.Scanner;

public class ExercicioFor03 {

	public static void main(String[] args) {
		int n1;
		double n2;
		double n3;
		double n4;
		double media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		n1 = sc.nextInt();
		
		for(int i = 0; i < n1;i++) {
			
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			n4 = sc.nextDouble();
			
			media = ((n2*2.0)+(n3*3.0)+(n4*5.0))/10.0;
			
			System.out.printf("Média: %.1f" , media);
		}
		
		sc.close();
	}

}
