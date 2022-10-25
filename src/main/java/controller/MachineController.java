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
	static Change change = new Change();

	static Beverages beverages;
	static Money money;

	public static void work() {
		inputVendingMachineOwnedMoney();
		inputBeverageInfoProcess();
		inputMoneyProcess();
		buyingProcess();
		returnChangeProcess();
	}

	static void inputVendingMachineOwnedMoney() {
		int vendingCoins = inputNumber.getInputNumber(inputView.SUMOFCOINS_INPUT_MENTION);
		coinController.setCoinsCnt(vendingCoins);
		outputView.printHaveCoins();
	}

	static void inputBeverageInfoProcess() {
		beverages = new Beverages(inputBeverage.inputBeverageInfo());
	}

	static void inputMoneyProcess() {
		System.out.println("");
		int inputMoney = inputNumber.getInputNumber(inputView.MONEY_INPUT_MENTION);
		money = new Money(inputMoney);
		outputView.printHaveMoney(money.getMoney());
	}

	static void buyingProcess() {
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

	static void returnChangeProcess() {
		change.setChange(money);
		outputView.printChange();
	}

}
