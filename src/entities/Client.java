package entities;

import exceptions.NoCashOrQuantityException;

public class Client {

	private String name;
	private Double cash;

	public Client(String name, Double cash) {
		this.name = name;
		this.cash = cash;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCash() {
		return cash;
	}

	public void setCash(Double cash) {
		this.cash = cash;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", cash=" + cash + "]";
	}

	public void comprar(Journal j) {
		try {
			if (cash < j.getPrice() || j.getQuantity() <= 0) {
				throw new NoCashOrQuantityException("No value error!");
			} else {
				cash -= j.getPrice();
				j.comprada();
			}
		} catch (NoCashOrQuantityException e) {
			System.out.println(e.getMessage());
		}

	}

}
