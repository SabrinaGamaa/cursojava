package comorientacaoaobjeto;

public class DadosFuncionarios {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary - tax;
	}
	
	public void incleaseSalary(double percentage) {
			this.grossSalary += (grossSalary * percentage / 100);
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", netSalary());
	}
}
