package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> produtos = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			if (ch == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Price: $ ");
				Double price = sc.nextDouble();
				
				produtos.add(new Product(name, price));
			}
		}
		
		System.out.println("PRICE TAGS: ");
		for (Product prod : produtos) {
			System.out.println(prod.toString());
		}
		
		
		sc.close();
	}
}
