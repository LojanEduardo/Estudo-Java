package exSecao08;

import java.util.Scanner;

import util.CurrencyConverter;

public class ConverterTeste {

	public static void main(String[] args) {
		
		double dollar;
		double manyDollar;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o preço do dolar: ");
		dollar = sc.nextDouble();
		System.out.println("Entre com a quantidade de dollar a ser comprada: ");
		manyDollar = sc.nextDouble();
		
		double price = CurrencyConverter.dollar(dollar, manyDollar);
		
		System.out.printf("O valor a ser pago em reais é $%.2f.", price);
		

	}

}
