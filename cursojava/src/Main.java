import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double y = 10.7254;
		int x = 60;
		String nome = "Maria";
		int idade = 21;
		double renda = 4000.0;
		System.out.println(y + x);
		System.out.printf("%.2f\n", y);
		System.out.println("Hello, World!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", y);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros\n", y);
		System.out.printf("%s tem %d anos e ganha R$%.2f reais\n", nome, idade, renda);
		
	}

}

//%f - ponto flutuante
//%d - numero inteiro
//%s - String
//\n - quebra de linha
