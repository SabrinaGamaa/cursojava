package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex002 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int num = sc.nextInt();
		double[] lista = new double[num];

		for (int i=0; i<lista.length; i++) {
			System.out.print("Digite um número: ");
			lista[i] = sc.nextInt();
		}
		
		
		double soma = 0;
		System.out.print("VALORES: ");
		for (int i=0; i<lista.length; i++) {
			System.out.print(lista[i] + " ");
			soma += lista[i];
		}
		
		System.out.println("\nSOMA = " + soma);
		double media = soma / lista.length;
		System.out.println("MEDIA = "+ media);
		
		sc.close();
		
	}
}
