package exSecao17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFileTeste {

	public static void main(String[] args) {
		
		String [] lines = new String[] {"Vai Brasil!","Vai Curintia","Vai Barça"};
		
		String path = "D:\\Projetos\\ws-eclipse\\Arquivos\\textoWrite.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e);
		}
	}

}
