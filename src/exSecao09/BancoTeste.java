package exSecao09;

import java.util.Scanner;

import entities.BankAccount;

public class BancoTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Valida = 0;
		BankAccount usu = new BankAccount();
		
		
		System.out.println("Entre com número da conta: ");
		int Nconta = sc.nextInt();
		System.out.println("Entre com nome do titular: ");
		String NomeTitular = sc.next();
		do {
			System.out.println("Deseja Fazer um depósito inicial?\nSim[1]\nNão[2] ");
			Valida = sc.nextInt();
		}while(Valida != 1 && Valida != 2);
		
		if(Valida == 1) {
			System.out.println("Entre com o depósito inicial: ");
			double ValorInicial = sc.nextDouble();
			 usu = new BankAccount(Nconta, NomeTitular, ValorInicial);
		}else {
			 usu = new BankAccount(Nconta, NomeTitular);
		}
		System.out.println("Entre com a quantidade a ser depositada: ");
		double deposito = sc.nextDouble();
		usu.Deposito(deposito);
		System.out.println(usu);
		
		System.out.println("Entre com a quantidade a ser sacada: ");
		double saque = sc.nextDouble();
		usu.Saque(saque);
		System.out.println(usu);
		
		sc.close();
	}

}
