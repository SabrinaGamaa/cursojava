package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ProgramEmployee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> funcionarios = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < num; i++) {
			System.out.printf("Employee %d° data: \n", (i+1));
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			
			System.out.print("Value per Hour: ");
			Double valueperhours = sc.nextDouble();
			
			if (outsourced == 'y') {
				System.out.println("Additional charge: ");
				Double addcharge = sc.nextDouble();
				funcionarios.add(new OutsourcedEmployee(name, hours, valueperhours, addcharge));
			}
			
			else {
				funcionarios.add(new Employee(name, hours, valueperhours));
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee func : funcionarios) {
			System.out.println(func);
		}
		
		
		
		sc.close();
	}
}
