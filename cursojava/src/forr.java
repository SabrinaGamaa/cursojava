import java.util.Scanner;

public class forr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantas vezes você quer somar algum número inteiro: ");
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int inicio=0; inicio < N; inicio++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		
		for (int i=5; i>=0; i--) {
			System.out.println("Valor de i:" + i);
		}
		sc.close();
		
	}
}
