import java.util.Locale;
import java.util.Scanner;

public class scannersc {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		Locale.setDefault(Locale.US);
		double n1;
		double n2;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		double soma = n1 + n2;
		System.out.printf("A soma de %.0f + %.0f é: %.0f\n", n1, n2, soma);
		

		sc.close();
		
	}
}
