package vect;

import java.util.Locale;
import java.util.Scanner;

public class vector {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] lista = new double[n];
		
		for (int i=0; i<n; i++) {
			lista[i] = sc.nextDouble();
		}
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			soma += lista[i];
		}
		
		double media = soma / n;
				
		System.out.printf("A média de alturas é de: %.2f\n", media);
		
		sc.close();
	}
}
