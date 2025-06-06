package entities;

//Como posso garantir que minha classe não pode ser iniciada - 
//	Basta torna um exemplo a conta Account ABSTRACT

public abstract class Account {
	protected Integer number;
	protected String holder;
	protected Double balance;
	
	public Account() {
	}

	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public void withdraw(Double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}

	public String toString() {
		return "Account: " + number + "\nHolder: " + holder + "\nBalance: $" + String.format("%.2f", balance);
	}
	
	
}
