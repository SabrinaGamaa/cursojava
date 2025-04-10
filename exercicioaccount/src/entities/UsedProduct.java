package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
	private LocalDate manufacture;
	private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, LocalDate manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}
	
	public LocalDate getManufacture() {
		return manufacture;
	}

	public void setManufacture(LocalDate manufacture) {
		this.manufacture = manufacture;
	}

	@Override
	public String priceTag() {
		return getName()
		        + " (Used) $ "
		        + String.format("%.2f", price)
		        + " (Manufacture data: "
		        + manufacture.format(fmt)
		        + ")";
	}
	
	@Override
	public String toString() {
		return priceTag();
	}
}
