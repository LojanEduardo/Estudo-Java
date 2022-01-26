package exSecao08;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class AlunosTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		
		do {
			System.out.println("Entre com nome do aluno: ");
			stu.name = sc.next();
			System.out.println("Entre com as notas deste aluno: ");
			stu.note1 = sc.nextDouble();
			stu.note2 = sc.nextDouble();
			stu.note3 = sc.nextDouble();		
		}while(stu.note1 < 0 || stu.note1 > 30 ||
				stu.note2 < 0 || stu.note2 > 35 ||
				stu.note3 < 0 || stu.note3 > 35);
		
		System.out.printf("FINAL GRADE %.2f%n" , stu.sumNotes());
		System.out.println(stu.Result(stu.sumNotes()));
		
	}

}
