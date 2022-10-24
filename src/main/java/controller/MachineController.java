package controller;

import controller.input.InputBeverage;
import controller.input.InputNumber;
import model.Beverages;
import model.Money;
import view.InputView;
import view.OutputView;

public class MachineController {
	static InputNumber inputNumber = new InputNumber();
	static InputView inputView = new InputView();
	static VendingMachine vm = new VendingMachine();
	static OutputView outputView = new OutputView();
	static InputBeverage inputBeverage = new InputBeverage();

	public static void main(String[] args) {
		int vendingCoins = inputNumber.getInputNumber(inputView.SUMOFCOINS_INPUT_MENTION);
		vm.setCoinsCnt(vendingCoins);

		outputView.printHaveCoins();
		Beverages beverages = new Beverages(inputBeverage.inputBeverageInfo());

		int inputMoney = inputNumber.getInputNumber(inputView.MONEY_INPUT_MENTION);
		Money money = new Money(inputMoney);
		outputView.printHaveMoney(money.getMoney());

	}
}
