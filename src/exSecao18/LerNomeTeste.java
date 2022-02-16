package exSecao18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class LerNomeTeste {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "D:\\Projetos\\ws-eclipse\\Arquivos\\ola.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String employeeCsv = br.readLine();
			while(employeeCsv != null) {
				String [] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for(Employee s : list) {
				System.out.println(s.getName() + ", " + s.getGrossSalary());
			}
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
	}

}
