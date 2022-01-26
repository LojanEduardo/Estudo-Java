package exSecao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee10;

public class EmployeeTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<Employee10> emp = new ArrayList<>();
				
		System.out.println("Quantos empregados foram registados?");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i);
			System.out.println("Id: ");
			int id = sc.nextInt();
			while(hasId(emp, id)) {
				System.out.println("Este id já existe, tente novamente!");
				id = sc.nextInt();
			}
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			System.out.println(i);
			emp.add(new Employee10(id, name, salary));
		}
		
		System.out.println("Entre com id do empregado que irá receber um aumento: ");
		int id = sc.nextInt();
		Employee10 emp1 = emp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);//busca os id e pega o primeiro retorno
		
		if(emp1 == null) {
			System.out.println("Este id não existe!");
		}else{
			System.out.println("Entre com a porcentagem: ");
			double perc = sc.nextDouble();
			emp1.aumentarSalario(perc);
		}
		
		System.out.println("List of employees: ");
		for(Employee10 obj : emp) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee10> list, int id) {
		Employee10 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);//busca os id e pega o primeiro retorno
		return emp != null;
	}
}
