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
	static InputBeverage inputBeverage = new InputBeverage();
	static InputBeverageName inputBeverageName = new InputBeverageName();
	static OutputView outputView = new OutputView();

	static CoinController coinController = new CoinController();
	static VendingMachine vendingMachine = new VendingMachine();
	static Change chanege = new Change();

	public static void main(String[] args) {
		int vendingCoins = inputNumber.getInputNumber(inputView.SUMOFCOINS_INPUT_MENTION);
		coinController.setCoinsCnt(vendingCoins);
		outputView.printHaveCoins();

		Beverages beverages = new Beverages(inputBeverage.inputBeverageInfo());

		int inputMoney = inputNumber.getInputNumber(inputView.MONEY_INPUT_MENTION);
		Money money = new Money(inputMoney);
		outputView.printHaveMoney(money.getMoney());

		buyingProcess(money, beverages);
		chanege.setChange(money);
		outputView.printChange();
	}

	private static void buyingProcess(Money money, Beverages beverages) {
		while (true) {
			String inputName;

			if (vendingMachine.checkMoney(money, beverages) || vendingMachine.checkCount(beverages)) {
				break;
			}

			inputName = inputBeverageName.getInputBeverageName(beverages, money);
			vendingMachine.buyingBeverage(inputName, money, beverages);
			outputView.printHaveMoney(money.getMoney());
		}
	}

}
