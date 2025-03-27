import java.util.Locale;
import java.util.Scanner;

public class scannersc2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		double num;
		nome = sc.next();
		idade = sc.nextInt();
		num = sc.nextDouble();
		System.out.println("Digite aqui");
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(num);
//		
		
		sc.close();
		
	}
}
