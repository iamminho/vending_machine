package model;

import java.util.Map;

public class Beverages {
	private Map<Beverage, Integer> beverages;

	public Beverages(Map<Beverage, Integer> map) {
		this.beverages = map;
	}

	public Map<Beverage, Integer> getBeverages() {
		return this.beverages;
	}

	// public void sold(String name) {
	// 	//beverages.put(beverage, beverages.get(beverage) - 1);
	// }

}
