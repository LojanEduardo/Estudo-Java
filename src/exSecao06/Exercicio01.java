package exSecao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		String n1 = "";
		String text;
		
		Scanner sc = new Scanner(System.in);
		Exercicios exe = new Exercicios();
		
		while(!n1.equals("2002")) {
			System.out.println("Entre com a senha: ");
			n1 = sc.next();
			
			text = exe.TesteSenha(n1);
			
			System.out.println(text);
		}
		
		System.out.println("Fim do programa");
		
		sc.close();
	}

}
