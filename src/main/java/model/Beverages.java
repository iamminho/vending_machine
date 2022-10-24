package model;

import java.util.Map;

public class Beverages {
	private Map<Beverage, Integer> beverages;

	public void add(Beverage beverage, int count) {
		this.beverages.put(beverage, count);
	}

	// public void sold(String name) {
	// 	//beverages.put(beverage, beverages.get(beverage) - 1);
	// }

}
