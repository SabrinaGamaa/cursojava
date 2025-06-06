package entities;

public class Product {
	private String name;
	protected Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public String priceTag() {
		return String.format("%.2f", price);
	}

	@Override
	public String toString() {
		return (name + " $ " + priceTag());
	}
	
	
	
	
}
