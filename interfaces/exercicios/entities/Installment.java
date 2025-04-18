package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Double amount;
	private LocalDate dueDate;
	
	public Installment() {
	}

	public Installment(Double amount, LocalDate dueDate) {
		this.amount = amount;
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	
	@Override
	public String toString() {
		return dueDate.format(fmt) + " - " + amount;
	}
	
}
