package entities;

public class Journal {

	private String name;
	private Double price;
	private Integer quantity;

	public Journal() {
	}

	public Journal(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void comprada() {
		if (quantity > 0)
			quantity -= 1;
	}

	@Override
	public String toString() {
		return "Journal [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
