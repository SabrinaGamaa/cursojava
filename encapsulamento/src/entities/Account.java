package entities;

public class Account {
	private String name;
	private int number;
	private double balance;
	
	public Account(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public Account(String name, int number, double initialDeposit) {
		this.name = name;
		this.number = number;
		deposit(initialDeposit);
	}
	 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}


	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return "Account "
			+ number
			+ ", Holder: "
			+ name
			+ ", Balance: $ "
			+ String.format("%.2f", balance);
	}
	
}
