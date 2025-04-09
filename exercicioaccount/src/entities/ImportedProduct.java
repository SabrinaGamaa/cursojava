package entities;

public class ImportedProduct extends Product {
	private Double customFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double plice, Double customFee) {
		super(name, plice);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public Double totalPrice() {
		return getPrice() + customFee;
	}
	
	@Override
	public String priceTag() {
	    return getName()
	        + " $ "
	        + String.format("%.2f", totalPrice())
	        + " (Custom fee: $ "
	        + String.format("%.2f", customFee)
	        + ")";
	}
	
	@Override
	public String toString() {
		return priceTag();
	}
	
}
