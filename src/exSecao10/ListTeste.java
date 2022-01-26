package exSecao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTeste {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); //list não aceita tipos primitivos
		
		list.add("Maria");	
		list.add("Maria");
		list.add("Lojan");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		list.remove("Marco");
		list.removeIf(x -> x.charAt(0) == 'L');//função lambda
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		System.out.println("Index of Maria: " + list.indexOf("Maria"));//retorna
		System.out.println("Index of Teste: " + list.indexOf("Teste"));
		System.out.println("----------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());//result recebe os valores iniciados com A
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);//Encontrar primeiro valor que começar com L
	}

}
