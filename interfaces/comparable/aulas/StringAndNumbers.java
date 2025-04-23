package aulas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.aulas.Funcionarios;

public class StringAndNumbers {
	public static void main(String[] args) {
		
		List<Funcionarios> list = new ArrayList<>();
		String path = "c://temp//namesandnumbers.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String funcionariosCsv = br.readLine();
			while (funcionariosCsv != null) {
				String[] fields = funcionariosCsv.split(",");
				String name = fields[0];
				Double salary = Double.parseDouble(fields[1]);
				
//				list.add(new Funcionarios(fields[0], Double.parseDouble(fields[1])));
				
				list.add(new Funcionarios(name, salary));
				funcionariosCsv = br.readLine();
			}
			
			
			System.out.println("Lista Ordenados por nomes: ");
			System.out.println("-----------------------------");
			Collections.sort(list);
			for (Funcionarios s : list) {
				System.out.println(s.getName() + ", " + s.getSalary());
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
	}
}
