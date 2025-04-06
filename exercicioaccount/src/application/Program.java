package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account client1 = new Account(1001, "Anna", 1000.0);
		Account client2 = new SavingAccount(1002, "Anna", 1000.0, 0.0);
		Account client3 = new BusinessAccount(1003, "Anna", 1000.0, 0.0);
		
		client1.withdraw(200.0);
		client2.withdraw(200.0);
		client3.withdraw(200.0);
		
		
		System.out.println("Conta normal: " + client1.getBalance());
		System.out.println("Conta Poupança: " + client2.getBalance());
		System.out.println("Conta Business: " + client3.getBalance());
		
	}
	
	
	
	
	
	
	
	
}
