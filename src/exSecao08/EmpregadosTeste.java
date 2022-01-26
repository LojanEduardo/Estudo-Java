package exSecao08;

import java.util.Scanner;

import entities.Employee;

public class EmpregadosTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Entre com o nome do empregado: ");
		emp.name = sc.next();
		System.out.println("Entre com o salário bruto deste empregado: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Entre com o valor do imposto: ");
		emp.tax = sc.nextDouble();
		
		System.out.println(emp);
		
		System.out.println("Entre com a porcentagem de aumento no salário: ");
		double perc = sc.nextDouble();
		
		emp.IncreasedSalary(perc);
		
		System.out.println("Atualização no salário de " + emp.name + " para "+ emp.grossSalary);
		
		
		
	}

}
