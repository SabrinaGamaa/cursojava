import java.util.Locale;
import java.util.Scanner;

import comorientacaoaobjeto.CalculatorExercicio;

public class membrosestaticosexercicio1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantily = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = R$ %.2f\n", CalculatorExercicio.CurrencyConverter(dollar, quantily));
		
		sc.close();
	}
	
}





