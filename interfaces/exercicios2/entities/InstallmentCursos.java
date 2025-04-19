package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InstallmentCursos {
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Double value;
	private LocalDate dueDate;
	
	public InstallmentCursos(){
	}

	
	public InstallmentCursos(Double value, LocalDate dueDate) {
		this.value = value;
		this.dueDate = dueDate;
	}


	public Double getValue() {
		return value;
	}


	public void setValue(Double value) {
		this.value = value;
	}


	public LocalDate getDueDate() {
		return dueDate;
	}


	@Override
	public String toString() {
		return dueDate.format(fmt) + " - " + String.format("%.2f", value);
	}


		
	
	
}
