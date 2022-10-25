package controller.input;

import java.util.Scanner;

import controller.exception.ExceptionOrderBeverageName;
import model.Beverages;
import model.Money;
import view.InputView;

public class InputOrderBeverage {
	static InputView inputView = new InputView();
	static ExceptionOrderBeverageName exceptionOrderBeverageName = new ExceptionOrderBeverageName();
	static Scanner sc = new Scanner(System.in);

	private String inputOrderBeverageName() {
		inputView.beverageNameInputMention();
		return sc.nextLine();
	}

	public String getInputOrderBeverageName(Beverages beverages, Money money) {
		while (true) {
			try {
				String input = inputOrderBeverageName();
				exceptionOrderBeverageName.isNameInBeverages(input, beverages);
				exceptionOrderBeverageName.canBuyBeverage(input, beverages, money);
				exceptionOrderBeverageName.isBeverageCntOverOne(input, beverages);
				return input;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
