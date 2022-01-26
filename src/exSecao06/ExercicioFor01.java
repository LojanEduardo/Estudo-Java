package exSecao06;

import java.util.Scanner;

public class ExercicioFor01 {

	public static void main(String[] args) {
		int n1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		n1 = sc.nextInt();
		
		for(int i = 0; i < n1; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
