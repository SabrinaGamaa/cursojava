package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emplyoee;

public class ex004 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Emplyoee> funcionarios = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int num = sc.nextInt();
		
		for (int i=0; i<num; i++) {
			System.out.printf("Emplyoee #%d: \n", i+1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();

			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Emplyoee emp = new Emplyoee(id, name, salary);
			
			funcionarios.add(emp);
			
		}
		
		System.out.print("Enter the emplyoee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		Emplyoee emp = funcionarios.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This is does not exist!");
		}
		
		else {
			System.out.print("Enter the percentage: ");
			double porct = sc.nextDouble();
			emp.increaseSalary(porct);
		}
		
		System.out.println("List of emplyoee: ");
		for (Emplyoee func : funcionarios) {
			System.out.println(func);
		}
		
		
		
		sc.close();
	}
}
