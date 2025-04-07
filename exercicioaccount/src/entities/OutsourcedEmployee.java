package entities;

public class OutsourcedEmployee extends Employee{

	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionCharge;
	}

	public Double getCharge() {
		return additionalCharge;
	}

	public void setCharge(Double Charge) {
		this.additionalCharge = Charge;
	}
	
	
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	
}
