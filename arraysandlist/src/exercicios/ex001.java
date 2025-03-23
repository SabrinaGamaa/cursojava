package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex001 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int num = sc.nextInt();
		int[] lista = new int[num];

		for (int i=0; i<lista.length; i++) {
			System.out.print("Digite um número: ");
			lista[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		for (int i=0; i<lista.length; i++) {
			if (lista[i] < 0) {
				System.out.println(lista[i]);
			}
		}
		
		sc.close();
		
	}
}
