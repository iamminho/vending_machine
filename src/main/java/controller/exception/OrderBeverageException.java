package controller.exception;

import java.util.Optional;

import model.Beverage;
import model.Beverages;
import model.Money;

public class OrderBeverageException {
	private static final String INVALID_BEVERAGE_NAME = "[ERROR] 자판기에 있는 상품명을 입력해 주세요.";
	private static final String OVER_PRICE = "[ERROR] 자판기 투입금액보다 상품의 가격이 높습니다. 다른 상품을 선택해주시기 바랍니다.";
	private static final String SOLD_OUT = "[ERROR] 해당 삼품의 재고가 없습니다. 다른 상품을 선택해주시기 바랍니다.";

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
		int price = getBeveragePrice(inputBeverageName, beverages);

		if (money.getMoney() < price) {
			throw new IllegalArgumentException(OVER_PRICE);
		}
	}

	public int getBeveragePrice(String inputBeverageName, Beverages beverages) {
		Optional<Beverage> beverage = getTargetBeverage(inputBeverageName, beverages);
		return beverage.get().getPrice();
	}

	public Optional<Beverage> getTargetBeverage(String inputBeverageName, Beverages beverages) {
		return beverages.getBeverages().keySet().stream()
			.filter(s -> s.getName().equals(inputBeverageName))
			.findFirst();
	}

	public void isBeverageCntOverOne(String inputBeverageName, Beverages beverages) {
		Beverage beverage = getTargetBeverage(inputBeverageName, beverages).get();
		int count = beverages.getBeverages().get(beverage);
		if (count == 0) {
			throw new IllegalArgumentException(SOLD_OUT);
		}
	}
}
