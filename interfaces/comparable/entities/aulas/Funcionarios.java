package entities.aulas;

public class Funcionarios implements Comparable<Funcionarios> {
	private String name;
	private Double salary;
	
	public Funcionarios(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
//	Ele serve para comparar um objeto com outro
//	Se eu quissese uma comparação por salario
//	@Override
//	public int compareTo(Funcionarios outro) {
//	Forma decrescente colocar o -salary
//		return -salary.compareTo(outro.getSalary());
//	}
	
	
//	Ele serve para comparar um objeto com outro
//	Comparação por nomes
	@Override
	public int compareTo(Funcionarios outro) {
		return name.compareTo(outro.getName());
	}
	
	
}
