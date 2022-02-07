package exSecao14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee10;
import entities.Funcionario;
import entities.Tercerizado;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionario = new ArrayList<>();
		
		
		System.out.println("Entre com o número de funcionários: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Funcionário #" + i + " dados: ");
			System.out.println("Ele é tercerizado(y/n)?");
			String sn = sc.next();
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Hora: ");
			int hora = sc.nextInt();
			System.out.println("Valor por hora: ");
			double vhora = sc.nextInt();
			
			if(sn.equals("y")) {
				System.out.println("Entre com valor adicional: ");
				double bonus = sc.nextDouble();
				funcionario.add(new Tercerizado(nome, hora, vhora, bonus));
			}else {
				funcionario.add(new Funcionario(nome, hora, vhora));
			}
			
		}
		
		System.out.println("PAGAMENTOS");
		for(Funcionario obj : funcionario) {
			System.out.println("Alex - $ " + obj.payment());
		}
	}

}
