import java.util.Scanner;

public class whileeinfinix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f \n", F);
			System.out.print("Deseja repetir (s/n) ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
		
	}
}
