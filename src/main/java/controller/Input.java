package controller;

import java.util.Scanner;

import view.InputView;

public class Input {
	static InputView inputView = new InputView();
	static ExceptionNumber exceptionNumber = new ExceptionNumber();
	static Scanner sc = new Scanner(System.in);

	private String getInputSumOfCoins() {
		inputView.SumOfCoinsInputMention();
		return sc.nextLine();
	}

	public int inputSumOfCoins() {
		while (true) {
			try {
				String inputNumber = getInputSumOfCoins();
				exceptionNumber.isNumber(inputNumber);
				exceptionNumber.isStartNumZero(inputNumber);
				exceptionNumber.isTenMultiple(inputNumber);
				return Integer.parseInt(inputNumber);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
