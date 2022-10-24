package controller;

import java.util.Scanner;

import view.InputView;

public class Input {
	static InputView inputView = new InputView();
	static ExceptionNumber exceptionNumber = new ExceptionNumber();
	static ExceptionString exceptionString = new ExceptionString();
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

	private String getInputBeverageInfo() {
		inputView.BeverageInfoInputMention();
		return sc.nextLine();
	}

	public String inputBeverageInfo() {
		while (true) {
			try {
				String inputString = getInputBeverageInfo();
				exceptionString.isLastSemicolone(inputString);
				exceptionString.isValidString(inputString);
				return inputString;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void getBeverageInfo() {
		
	}

}
