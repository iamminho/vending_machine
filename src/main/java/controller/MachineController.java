package controller;

import controller.input.InputBeverage;
import controller.input.InputBeverageName;
import controller.input.InputNumber;
import model.Beverages;
import model.Money;
import view.InputView;
import view.OutputView;

public class MachineController {
	static InputNumber inputNumber = new InputNumber();
	static InputView inputView = new InputView();
	static CoinController coinController = new CoinController();
	static OutputView outputView = new OutputView();
	static InputBeverage inputBeverage = new InputBeverage();
	static InputBeverageName inputBeverageName = new InputBeverageName();

	public static void main(String[] args) {
		// int vendingCoins = inputNumber.getInputNumber(inputView.SUMOFCOINS_INPUT_MENTION);
		// coinController.setCoinsCnt(vendingCoins);
		// outputView.printHaveCoins();

		Beverages beverages = new Beverages(inputBeverage.inputBeverageInfo());

		int inputMoney = inputNumber.getInputNumber(inputView.MONEY_INPUT_MENTION);
		Money money = new Money(inputMoney);
		outputView.printHaveMoney(money.getMoney());

		String inputName = inputBeverageName.getInputBeverageName(beverages, money);

		// while (money.getMoney() < beverages.getMinPrice()) {
		// 	inputView.BeverageNameInputMention();
		// 	String inputName = inputBeverageName.getInputBeverageName(beverages);
		// }

	}
}
