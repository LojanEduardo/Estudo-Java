package exSecao14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaF;
import entities.PessoaJ;

public class ExercicioProposto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> contribuinte = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.println("Individual or company (i/c)? ");
			String pes = sc.next();
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Anual income: ");
			double anual = sc.nextDouble();
			if(pes.equals("i")) {
				System.out.println("Health expenditures: ");
				double health = sc.nextDouble();
				contribuinte.add(new PessoaF(name, anual, health));
			}else {
				System.out.println("Number of employees");
				int nEmp = sc.nextInt();
				contribuinte.add(new PessoaJ(name, anual, nEmp));
			}	
		}
		double tot = 0;
		for(Contribuinte c : contribuinte) {
			System.out.println(c.getNome() + ": $ " + c.Imposto());
			tot += c.Imposto();
		}
		
		System.out.println("TOTAL TAXES: $ " + tot);
		
	}

}
// 3 i Alex 50000 2000 c SoftTech 400000 25 i Bob 120000 1000