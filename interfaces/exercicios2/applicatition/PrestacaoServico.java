package applicatition;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Course;
import entities.InstallmentCursos;
import entities.services.ContractCourse;
import entities.services.PaypalServiceCourse;

public class PrestacaoServico {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.print("Número do curso: ");
		Integer number = sc.nextInt();	
		System.out.print("Data de início: ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);	
		System.out.print("Valor total do curso: ");
		Double value = sc.nextDouble();
		
		Course course = new Course(number, date, value);
		
		System.out.print("Número de parcelas: ");
		Integer instal = sc.nextInt();
		
		ContractCourse contractCourse = new ContractCourse(new PaypalServiceCourse());
		contractCourse.processContract(course, instal);
		
		System.out.println();
		System.out.println("Pacelas: ");
		for (InstallmentCursos parcelas : course.getListaParcelas()) {
			System.out.println(parcelas.toString());
		}
		
		;
		sc.close();
	}

}
