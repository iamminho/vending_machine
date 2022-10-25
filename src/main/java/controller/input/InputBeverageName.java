package controller.input;

import java.util.Scanner;

import controller.exception.ExceptionBeverageName;
import model.Beverages;
import model.Money;
import view.InputView;

public class InputBeverageName {
	static InputView inputView = new InputView();
	static ExceptionBeverageName exceptionBeverageName = new ExceptionBeverageName();
	static Scanner sc = new Scanner(System.in);

	private String inputBeverageName() {
		inputView.BeverageNameInputMention();
		return sc.nextLine();
	}

	public String getInputBeverageName(Beverages beverages, Money money) {
		while (true) {
			try {
				String input = inputBeverageName();
				exceptionBeverageName.isNameInBeverages(input, beverages);
				exceptionBeverageName.canBuyBeverage(input, beverages, money);
				exceptionBeverageName.isBeverageCntOverOne(input, beverages);
				return input;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
