package model;

import java.util.HashMap;
import java.util.Map;

public class Beverages {
	private Map<Beverage, Integer> beverages = new HashMap<>();

	public void add(Beverage beverage, int count) {
		beverages.put(beverage, count);
	}

	public void sold(Beverage beverage) {
		beverages.put(beverage, beverages.get(beverage) - 1);
	}
}
