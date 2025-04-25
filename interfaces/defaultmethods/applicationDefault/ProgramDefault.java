package applicationDefault;

import java.util.Locale;
import java.util.Scanner;

import servicesDefault.BrazilInterestService;
import servicesDefault.InterestService;
import servicesDefault.UsaInterestService2;

public class ProgramDefault {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		System.out.println("Payment after " + months + " months: ");
		System.out.println(String.format("%.2f", payment));
		
		System.out.println();
		
		
		InterestService isUsa = new UsaInterestService2(1.0);
		double paymentUsa = isUsa.payment(amount, months);
		System.out.println("Payment after " + months + " months: ");
		System.out.println(String.format("%.2f", paymentUsa));
		
		
		sc.close();
	}
	
}
