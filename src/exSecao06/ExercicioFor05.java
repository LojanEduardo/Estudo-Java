package exSecao06;

import java.util.Scanner;

public class ExercicioFor05 {

	public static void main(String[] args) {
		
		int n1;
		int fat = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		n1 = sc.nextInt();
		
		for(int i = 0; i <= n1 ; i++) {
			if(i != 0) {
				fat = fat * i;
			}
		}
		
		System.out.println(fat);
		
		sc.close();

	}

}
