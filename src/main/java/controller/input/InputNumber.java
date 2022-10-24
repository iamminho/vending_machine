package controller.input;

import java.util.Scanner;

import controller.exception.ExceptionNumber;
import view.InputView;

public class InputNumber {
	static InputView inputView = new InputView();
	static ExceptionNumber exceptionNumber = new ExceptionNumber();

	static Scanner sc = new Scanner(System.in);

	private String inputNumber(String mention) {
		System.out.println(mention);
		return sc.nextLine();
	}

	public int getInputNumber(String mention) {
		while (true) {
			try {
				String input = inputNumber(mention);
				exceptionNumber.isNumber(input);
				exceptionNumber.isStartNumZero(input);
				exceptionNumber.isTenMultiple(input);
				return Integer.parseInt(input);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
