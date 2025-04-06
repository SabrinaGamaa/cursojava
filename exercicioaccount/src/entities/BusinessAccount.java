package entities;

public class BusinessAccount extends Account{
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			loanLimit -= amount;
		}
	}
	
	@Override
	public final void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

	@Override
	public String toString() {
		return "BusinessAccount: "
	+ number 
	+ "\nLoanLimit: " 
	+ String.format("%.2f", loanLimit) 
	+ "\nHolder: " 
	+ holder 
	+ "\nBalancer: " + String.format("%.2f", balance);
		
	}
	
	
	
}
