package exSecao06;

import java.util.Scanner;

public class ExercicioFor07 {

	public static void main(String[] args) {
		double n1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		n1 = sc.nextDouble();
		
		for(int i = 1; i <= n1 ; i++) {
			System.out.print(i + " ");
			System.out.print(i * i + " ");
			System.out.println((i * i)*i);
		}
		
		sc.close();
	}

}
