package exSecao05;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		
		String text = "";
		int cont = 0;
		double energia = 0, total = 0;
		int pergunta;
		
		Scanner sc = new Scanner(System.in);
		
		do {	
			System.out.println("Entre com a quantidade de energia que est� m�quina gasta: ");
			energia = sc.nextDouble();
			total += energia;
			System.out.println("Quer adicionar outra m�quina?\nPara sim digite[1]\nPara n�o digite[2]");
			text = sc.next();
			cont++;
		}while(text.equals("1"));
		
		System.out.println("---------------------------");
		System.out.println("Atual contador "+total+"/tempo");
		System.out.println("---------------------------");
		System.out.println("Deseja adicionar um sistema de economia?");
		System.out.println("Sim[1]");
		System.out.println("N�o[2]");
		pergunta = sc.nextInt();
		
		if(pergunta == 1) {
			total = total/cont;
			System.out.println("---------------------------");
			System.out.printf("Atual contador %.1f/tempo%n", total);
			System.out.println("---------------------------");
			System.out.println("Fim de programa.");
		}else {
			System.out.println("Atual contador "+total+"/tempo");
			System.out.println("Fim de programa.");
		}
		
	}

}
