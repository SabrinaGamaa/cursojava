import java.util.Locale;
import java.util.Scanner;

import comorientacaoaobjeto.DadosFuncionarios;

public class ex002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DadosFuncionarios funcionario = new DadosFuncionarios();
		funcionario.name = "Joao Silva";
		funcionario.grossSalary = 6000.00;
		funcionario.tax = 1000.00;
		
		System.out.println("Employee: " + funcionario.toString());
		
		System.out.print("Which percentage to increase salary? ");
		funcionario.incleaseSalary(sc.nextDouble());
		
		System.out.println("Update data: " + funcionario.toString());
		
		sc.close();
		
	}
}
