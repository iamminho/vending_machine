package controller.exception;

import java.util.Optional;

import model.Beverage;
import model.Beverages;
import model.Money;

public class ExceptionBeverageName {
	private static final String INVALID_BEVERAGE_NAME = "[ERROR] 자판기에 있는 상품명을 입력해 주세요.";
	private static final String OVER_PRICE = "[ERROR] 자판기 투입금액보다 상품의 가격이 높습니다. 다른 상품을 선택해주시기 바랍니다.";

	public void isNameInBeverages(String inputBeverageName, Beverages beverages) {
		boolean flag = false;

		for (Beverage beverage : beverages.getBeverages().keySet()) {
			if (beverage.getName().equals(inputBeverageName)) {
				flag = true;
				break;
			}
		}

		throwError(flag);
	}

	private void throwError(boolean flag) {
		if (!flag) {
			throw new IllegalArgumentException(INVALID_BEVERAGE_NAME);
		}
	}

	public void canBuyBeverage(String inputBeverageName, Beverages beverages, Money money) {
		Optional<Beverage> beverage = beverages.getBeverages().keySet().stream()
			.filter(s -> s.getName().equals(inputBeverageName))
			.findFirst();
		int price = beverage.get().getPrice();

		if (money.getMoney() < price) {
			throw new IllegalArgumentException(OVER_PRICE);
		}
	}
}
