package exSecao08;

import java.util.Scanner;

import entities.Employee;

public class EmpregadosTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Entre com o nome do empregado: ");
		emp.name = sc.next();
		System.out.println("Entre com o sal�rio bruto deste empregado: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Entre com o valor do imposto: ");
		emp.tax = sc.nextDouble();
		
		System.out.println(emp);
		
		System.out.println("Entre com a porcentagem de aumento no sal�rio: ");
		double perc = sc.nextDouble();
		
		emp.IncreasedSalary(perc);
		
		System.out.println("Atualiza��o no sal�rio de " + emp.name + " para "+ emp.grossSalary);
		
		
		
	}

}
