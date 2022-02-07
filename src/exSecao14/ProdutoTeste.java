package exSecao14;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto2;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Produto2> pro = new ArrayList<>();
		
		System.out.println("Entre com o número de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n ; i++) {
			System.out.println("Produto #"+i+" dados: ");
			System.out.println("O produto é comum, usado ou importado(c/u/i): ");
			String resul = sc.next();
			System.out.println("Nome: ");
			String name = sc.next();
			System.out.println("Preço: ");
			Double price = sc.nextDouble();
			
			if(resul.equals("c")) {
				pro.add(new Produto2(name, price));
			}else if(resul.equals("i")) {
				System.out.println("Customs fee: ");
				Double cf = sc.nextDouble();
				pro.add(new ProdutoImportado(name, price, cf));
			}else {
				pro.add(new ProdutoUsado(name, price, new Date()));
			}
		}
		
		for(Produto2 pr : pro) {
			System.out.println(pr.priceTag());
		}
		
	}

}
