package controller;

import controller.input.InputVendingCoins;
import view.OutputView;

public class MachineController {
	static InputVendingCoins inputVendingCoins = new InputVendingCoins();
	static VendingMachine vm = new VendingMachine();
	static OutputView outputView = new OutputView();

	public static void main(String[] args) {
		int vendingCoins = inputVendingCoins.getVendingCoins();
		vm.setCoinsCnt(vendingCoins);
		outputView.printHaveCoins();

	}
}
