package model.services;

public class BrazilTaxService {
	
	public double Tex(double amount) {
		if (amount > 100.0) {
			return amount * 0.15;
		}
		else {
			return amount * 0.20;
		}
	}
	
}
