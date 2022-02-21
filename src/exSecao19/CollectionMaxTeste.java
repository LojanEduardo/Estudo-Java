package exSecao19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;
import entities.Product;
import services.CalculationService;

public class CollectionMaxTeste {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();// cria uma lista de product
		String path = "D:\\Projetos\\ws-eclipse\\Arquivos\\products.txt";//declaro o path dos lugares onde s�o salvos os meus produtos
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){//file reader l� o path e buff deixa mais r�pido
			
			String productCsv = br.readLine();//productCsv recebe a primeira linha no arquivo products.txt
			while(productCsv != null) {//valido se a linha � null
				String [] fields = productCsv.split(",");//crio um vetor de string que recebe o produto e pre�o que est�o na linha
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));//adiciono na lista de produtos, o nome e seu pre�o
				productCsv = br.readLine();//e come�o a ler a proxima linha
			}
			Product x = CalculationService.max(list);
			System.out.print("Max: "+ x);
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
