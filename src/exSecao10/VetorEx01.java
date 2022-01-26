package exSecao10;

import java.util.Scanner;

import entities.Student_;

public class VetorEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student_ [] vetor = new Student_[10];
		
		System.out.println("Quantos quartos serão ocupados?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Posição: " + i);
			System.out.println("Nome: ");
			String name = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Student_(name, email);
			}
		
		System.out.println("Quarto Ocupados: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] != null) {
				System.out.println(i+": "+vetor[i].getName()+", "+vetor[i].getEmail());
			}
		}
	}

}
