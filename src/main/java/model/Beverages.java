package model;

import java.util.Iterator;
import java.util.Map;

public class Beverages {
	private Map<Beverage, Integer> beverages;

	public Beverages(Map<Beverage, Integer> map) {
		this.beverages = map;
	}

	public Map<Beverage, Integer> getBeverages() {
		return this.beverages;
	}

	public int getMinPrice() {
		Iterator<Beverage> interator = beverages.keySet().iterator();
		int min = Integer.MAX_VALUE;

		while (interator.hasNext()) {
			int target = interator.next().getPrice();
			if (min > target) {
				min = target;
			}
		}

		return min;
	}
}
