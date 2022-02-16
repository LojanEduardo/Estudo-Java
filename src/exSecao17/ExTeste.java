package exSecao17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ExTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome, preço e quantidade separados por vírgula: ");
		String produto = sc.nextLine();
		
		String array[] = new String[3];

		array = produto.split(",");
		
		double tot = Double.parseDouble(array[1]) * Double.parseDouble(array[2]);
		
		String lines = array[0] + "," +String.valueOf(tot);
		
		String path = "D:\\Projetos\\ws-eclipse\\Arquivos";
		
		boolean success = new File(path + "\\out").mkdir();
		
		String pathStr = path + "\\out\\summary.csv";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathStr, true))) {			
			bw.write(lines);
			bw.newLine();
		}catch(IOException e) {
			System.out.println("Error: " + e);
		}
		
	}

}
