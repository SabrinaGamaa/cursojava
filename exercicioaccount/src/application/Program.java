package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Integer number = 12345;
		String holder = "João";
		double balance = 2000;	
		Account client = new Account(number, holder, balance);
		System.out.println(client.toString());
		
		System.out.println();
		
		Integer number2 = 34567;
		String holder2 = "Janaina";
		double balance2 = 8000;	
		BusinessAccount client2 = new BusinessAccount(number2, holder2, balance2, 5000.00);
		System.out.println(client2.toString());
		
		
		System.out.println();
		System.out.println("Fazendo um deposito: ");
		client2.deposit(1200.00);
		System.out.println(client2.toString());
		
		System.out.println();
		System.out.println("Fazendo um saque: ");
		client2.withdraw(200.00);
		System.out.println(client2.toString());
		
		System.out.println();
		System.out.println("Usando o limite: ");
		client2.loan(3000.00);
		System.out.println(client2.toString());
	}
	
}
