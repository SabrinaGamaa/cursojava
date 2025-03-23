package vect;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many registration?");
		int n = sc.nextInt();
		
		Product[] lista = new Product[n];
		
		for (int i=0; i<lista.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			lista[i] = new Product(name, price);
		}
		
		double soma = 0;
		for (int i=0; i<lista.length; i++) {
			soma += lista[i].getPrice();
		}
		
		System.out.println("Sum Total: " + soma);
		
		double media = soma / lista.length;
		
		System.out.println("Average price: " + media);
		
		sc.close();
	}
}
