package exSecao18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PayPalJuroService;

public class exTeste {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter contract data: ");
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Date (dd/MM/yyyy)");
		Date date = sdf.parse(sc.next());
		System.out.println("Contract value: ");
		double cv = sc.nextDouble();
		
		Contract con = new Contract(number, date, cv);
		
		ContractService cs = new ContractService(new PayPalJuroService());
		System.out.println("Enter number of installments: ");
		int install = sc.nextInt();
		cs.processContract(con, install);
		
		System.out.println("Installments: ");
		for(Installment it : con.getInstallment()) {
			System.out.println(it);
		}
	}

}
