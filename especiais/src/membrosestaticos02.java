import java.util.Locale;
import java.util.Scanner;
import comorientacaoaobjeto.Calculator;

public class membrosestaticos02 {
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = cal.circumference(radius);
		double v = cal.volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI: %.2f\n", cal.PI);
		
	
		
		sc.close();
	}
	
}





