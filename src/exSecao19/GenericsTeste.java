package exSecao19;

import java.util.Scanner;

import services.PrintService;

public class GenericsTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.println("How many values? ");
		int n = sc.nextInt();
		
		//ps.addValue("Pera");
		
		for(int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);

	}

}
