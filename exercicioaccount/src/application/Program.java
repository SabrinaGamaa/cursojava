package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
//		Account client1 = new Account(1001, "Anna", 1000.0); - CLASSE ABSTRACT
		Account client2 = new SavingAccount(1002, "Anna", 1000.0, 0.0);
		Account client3 = new BusinessAccount(1003, "Anna", 1000.0, 0.0);
		
//		client1.withdraw(200.0); - CLASSE ABSTRACT
		client2.withdraw(200.0);
		client3.withdraw(200.0);
		
		
//		System.out.println("Conta normal: " + client1.getBalance()); - CLASSE ABSTRACT
		System.out.println("Conta Poupança: " + client2.getBalance());
		System.out.println("Conta Business: " + client3.getBalance());
		
		System.out.println(" ------ Polimorfismo ------- ");
		
//		Account x = new Account(2001, "Alex", 1000.0); - CLASSE ABSTRACT
		Account y = new SavingAccount(2002, "Maria", 1000.0, 0.01);
		
//		x.withdraw(50.0); - - CLASSE ABSTRACT
		y.withdraw(50.0);
		
//		System.out.println(x); - CLASSE ABSTRACT
		System.out.println();
		System.out.println(y);
		
		
		
	}
	
	
	
	
	
	
	
	
}
