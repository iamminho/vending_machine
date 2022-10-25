package controller.input;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import controller.exception.StringException;
import model.Beverage;
import view.InputView;

public class BeverageInput {
	static InputView inputView = new InputView();
	static StringException stringException = new StringException();
	static Scanner sc = new Scanner(System.in);

	private String inputBeverage() {
		inputView.beverageInfoInputMention();
		return sc.nextLine();
	}

	private String validInputBeverage() {
		while (true) {
			try {
				String inputString = inputBeverage();
				stringException.isLastCloseBrackets(inputString);
				stringException.isBetweenSemiColone(inputString);
				stringException.isValidString(inputString);
				return inputString;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public Map<Beverage, Integer> inputBeverageInfo() {
		String[] inputBeverageArr = validInputBeverage().split(";");
		Map<Beverage, Integer> map = new HashMap<>();

		for (String beverageInfo : inputBeverageArr) {
			setBeverageInfo(beverageInfo, map);
		}

		return map;
	}

	private void setBeverageInfo(String beverageInfo, Map<Beverage, Integer> map) {
		String[] beverageInfoArr = getBeverageInfoArr(beverageInfo);
		String name = beverageInfoArr[0];
		int price = Integer.parseInt(beverageInfoArr[1]);
		int count = Integer.parseInt(beverageInfoArr[2]);
		Beverage beverage = new Beverage(name, price);

		map.put(beverage, count);
	}

	private String[] getBeverageInfoArr(String beverageInfo) {
		String regExp = "[\\[\\]]";
		return beverageInfo.replaceAll(regExp, "").trim().split(",");
	}

}
