package entities.services;

import java.time.LocalDate;

import entities.Course;
import entities.InstallmentCursos;

public class ContractCourse {

	private OnlinePayment onlinePayment;

	public ContractCourse(OnlinePayment onlinePayment) {
		this.onlinePayment = onlinePayment;
	}
	
	
	public void processContract(Course course, int months) {
		
		double basicQuota = course.getValue() / months;
		
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = course.getDate().plusMonths(i);
			double interest = onlinePayment.interest(basicQuota, i);
			double fee = onlinePayment.paymentFee(basicQuota + interest);
			double fullQuota = basicQuota + interest + fee;
			
			course.getListaParcelas().add(new InstallmentCursos(fullQuota, dueDate));
		}
		
	}
	
	
}
