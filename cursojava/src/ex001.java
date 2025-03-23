import java.util.Locale;
import comorientacaoaobjeto.LarguraTriangulo;



public class ex001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
		LarguraTriangulo calculo = new LarguraTriangulo();
				
		System.out.print("Enter rectangle width and height: ");
		calculo.height = 3;
		calculo.width = 4;
		
		System.out.printf("AREA: %.2f\n", calculo.area());
		System.out.printf("PERIMETER: %.2f\n", calculo.perimeter());
		System.out.printf("DIAGONAL: %.2f\n", calculo.diagonal());
//		sc.close();
		
	}
}
