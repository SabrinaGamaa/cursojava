package entities.services;

public interface OnlinePayment {
	
	double interest(double amount, int months);
	double paymentFee(double amount);
	
}
