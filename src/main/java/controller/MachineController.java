package controller;

import model.SumOfCoins;
import view.OutputView;

public class MachineController {
	static Input input = new Input();
	static VendingMachine vm = new VendingMachine();
	static SumOfCoins sumOfCoins = new SumOfCoins(input.inputSumOfCoins());
	static OutputView outputView = new OutputView();

	public static void main(String[] args) {
		vm.setCoinsCnt((sumOfCoins.getSumOfCoins()));
		outputView.printHaveCoins();
	}
}
