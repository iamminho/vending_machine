package controller;

import controller.input.InputBeverage;
import controller.input.InputVendingCoins;
import model.Beverages;
import view.OutputView;

public class MachineController {
	static InputVendingCoins inputVendingCoins = new InputVendingCoins();
	static VendingMachine vm = new VendingMachine();
	static OutputView outputView = new OutputView();
	static InputBeverage inputBeverage = new InputBeverage();

	public static void main(String[] args) {
		int vendingCoins = inputVendingCoins.getVendingCoins();
		vm.setCoinsCnt(vendingCoins);
		outputView.printHaveCoins();
		Beverages beverages = new Beverages(inputBeverage.inputBeverageInfo());

	}
}
