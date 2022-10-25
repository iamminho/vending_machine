package controller;

import controller.exception.ExceptionBeverageName;
import model.Beverage;
import model.Beverages;
import model.Money;

public class VendingMachine {
	static ExceptionBeverageName exceptionBeverageName = new ExceptionBeverageName();

	public void buyingBeverage(String inputName, Money money, Beverages beverages) {
		int price = exceptionBeverageName.getBeveragePrice(inputName, beverages);

		deductMoney(price, money);
		deductBeverageCnt(inputName, beverages);
	}

	private void deductMoney(int price, Money money) {
		money.setMoney(price);
	}

	private void deductBeverageCnt(String inputName, Beverages beverages) {
		Beverage beverage = exceptionBeverageName.getTargetBeverage(inputName, beverages).get();
		int count = beverages.getBeverages().get(beverage) - 1;

		beverages.getBeverages().put(beverage, count);
	}

	public boolean checkMoney(Money money, Beverages beverages) {
		if (money.getMoney() < beverages.getMinPrice()) {
			return true;
		}
		return false;
	}

	public boolean checkCount(Beverages beverages) {
		for (int count : beverages.getBeverages().values()) {
			if (count > 0) {
				return false;
			}
		}
		return true;
	}

}
