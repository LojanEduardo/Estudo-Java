package exSecao06;

import java.util.Scanner;

public class ExercicioFor06 {

	public static void main(String[] args) {
		int n1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		n1 = sc.nextInt();
		
		for ( int i = 1; i <= n1 ; i++) {
			if(n1%i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
