package model.services;

import java.time.Duration;

import aulas.entities.CarRental;
import aulas.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
//	Não é uma boa pratica
	private BrazilTaxService taxService;
	
	public RentalService(){
	}

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public BrazilTaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			double days = Math.ceil(hours) / 24.0;
			basicPayment = pricePerDay * Math.ceil(days);
		}
		
		double tax = taxService.Tex(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
