package exSecao11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ComposiçãoTeste {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o nome do departamento: ");
		String departamento = sc.next();
		System.out.println("Entre com woker data: ");
		System.out.println("Name :");
		String workerName = sc.next();
		System.out.println("Level :");
		String workerLevel = sc.next();
		System.out.println("Salario: ");
		double workerSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departamento));
		
		System.out.println("Quantos contratos este trabalhador irá ter? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.println("-------------------------");
			System.out.println("Contrato de número " + i);
			System.out.println("-------------------------");
			System.out.println("Entre com a data do contrato (DD/MM/YYYY)");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.println("Duração(Hora): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valorHora, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.println("Entre com mes e ano para calcular o income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
