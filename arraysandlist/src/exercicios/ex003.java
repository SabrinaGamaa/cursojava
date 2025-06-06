package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.MediaAltura;

public class ex003 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int num = sc.nextInt();
		MediaAltura[] lista = new MediaAltura[num];
		
		for (int i=0; i<lista.length; i++) {
			System.out.printf("Dados da %d° pessoa \n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			lista[i] = new MediaAltura(nome, idade, altura);
		}
		
		double soma = 0;
		double menores = 0;
		for (int i=0; i<lista.length; i++) {
			soma += lista[i].getAltura();
			if (lista[i].getIdade() <= 16) {
				menores += 1;
			}
		}
		
		double media = soma / lista.length;
		System.out.printf("Altura média: %.2f\n", media);
		
		double media_menores = menores / lista.length * 100;
		System.out.printf("Pessoas com menos de 16 anos : %.1f\n", media_menores);
		
		sc.close();
		
	}
}
