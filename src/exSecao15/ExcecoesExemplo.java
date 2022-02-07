package exSecao15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecoesExemplo {

	public static void main(String[] args) {
				
		
		metodo1();
		
		System.out.println("End");
		
		
	}
	public static void metodo1() {
		System.out.println("**Metodo 1 começo**");
		metodo2();
		System.out.println("**Metodo 1 fim**");
	}

	public static void metodo2() {
		System.out.println("**Metodo 2 começo**");
		Scanner sc = new Scanner(System.in);
			
		try {
			String[] vet = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vet[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Inválido!");
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("Input erro");
		}
		
		sc.close();
		System.out.println("**Metodo 2 fim**");
	}
	
}
