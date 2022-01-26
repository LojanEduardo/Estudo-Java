package exSecao06;

import java.util.Scanner;

public class ExercicioFor02 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int contIn = 0;
		int contOut = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		n1 = sc.nextInt();
		
		for(int i = 0; i < n1; i++) {
			
			System.out.println("Entre com um valor: ");
			n2 = sc.nextInt();
			
			if(n2 >= 10 && n2 <= 20) {
				contIn++;
			}else {
				contOut++;
			}
		}
		
		System.out.println(contIn + " in\n" + contOut + " out\n");
		System.out.println("Fim de programa.");
		sc.close();
	}

}
