import java.util.Locale;
import java.util.Scanner;
import comorientacaoaobjeto.CalculatorTwo;

public class membrosestaticos03 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = CalculatorTwo.circumference(radius);
		double v = CalculatorTwo.volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI: %.2f\n", CalculatorTwo.PI);
		
	
		
		sc.close();
	}
	
}





