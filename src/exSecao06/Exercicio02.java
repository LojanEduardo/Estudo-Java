package exSecao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		String text;
		
		Scanner sc = new Scanner(System.in);
		
		while(x != 0 && y != 0) {
			System.out.println("Entre com valor de X: ");
			x = sc.nextInt();
			System.out.println("Entre com valor de Y: ");
			y = sc.nextInt();
			
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			}else if(x > 0 && y < 0) {
				System.out.println("Quarto");
			}else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			}else if(x < 0 && y > 0){
				System.out.println("Segundo");
			}
		}
		
		
		sc.close();
		
	}

}
