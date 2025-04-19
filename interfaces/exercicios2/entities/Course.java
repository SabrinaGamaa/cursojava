package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private Integer number;
	private LocalDate date;
	private Double value;
	
	private List<InstallmentCursos> listaParcelas = new ArrayList<>();
	
	public Course() {
	}


	public Course(Integer number, LocalDate date, Double value) {
		super();
		this.number = number;
		this.date = date;
		this.value = value;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Double getValue() {
		return value;
	}


	public void setValue(Double value) {
		this.value = value;
	}


	public List<InstallmentCursos> getListaParcelas() {
		return listaParcelas;
	}	
	
}
