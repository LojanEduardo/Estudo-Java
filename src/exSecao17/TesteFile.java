package exSecao17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteFile {

	public static void main(String[] args) {
		
		File file = new File("D:\\Projetos\\ws-eclipse\\Arquivos\\in.texto");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
