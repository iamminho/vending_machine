package controller.input;

import java.util.Scanner;

import controller.exception.OrderBeverageException;
import model.Beverages;
import model.Money;
import view.InputView;

public class OrderBeverageInput {
	static InputView inputView = new InputView();
	static OrderBeverageException orderBeverageNameException = new OrderBeverageException();
	static Scanner sc = new Scanner(System.in);

	private String inputOrderBeverageName() {
		inputView.beverageNameInputMention();
		return sc.nextLine();
	}

	public String getInputOrderBeverageName(Beverages beverages, Money money) {
		while (true) {
			try {
				String input = inputOrderBeverageName();
				orderBeverageNameException.isNameInBeverages(input, beverages);
				orderBeverageNameException.canBuyBeverage(input, beverages, money);
				orderBeverageNameException.isBeverageCntOverOne(input, beverages);
				return input;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
