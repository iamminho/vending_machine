package model;

public class Beverage {
	private final String name;
	private final int price;

	public Beverage(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}
}
