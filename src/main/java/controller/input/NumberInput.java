package controller.input;

import java.util.Scanner;

import controller.exception.NumberException;
import view.InputView;

public class NumberInput {
	static InputView inputView = new InputView();
	static NumberException numberException = new NumberException();

	static Scanner sc = new Scanner(System.in);

	private String inputNumber(String mention) {
		System.out.println(mention);
		return sc.nextLine();
	}

	public int getInputNumber(String mention) {
		while (true) {
			try {
				String input = inputNumber(mention);
				numberException.isNumber(input);
				numberException.isStartNumZero(input);
				numberException.isTenMultiple(input);
				return Integer.parseInt(input);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
