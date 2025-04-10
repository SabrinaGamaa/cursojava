package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

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
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: $ ");
			Double price = sc.nextDouble();
			
			if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String manuf = sc.nextLine();
				LocalDate manufacture = LocalDate.parse(manuf, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				produtos.add(new UsedProduct(name, price, manufacture));
			}
			
			else if (ch == 'i') {
				System.out.print("Custom Fee: $");
				Double customFee = sc.nextDouble();
				
				produtos.add(new ImportedProduct(name, price, customFee));
			}
			
			else {
				produtos.add(new Product(name, price));
			}
			
			
		}
		
		System.out.println();
		
		System.out.println("PRICE TAGS: ");
		for (Product prod : produtos) {
			System.out.println(prod.toString());
		}
		
		
		sc.close();
	}
}
