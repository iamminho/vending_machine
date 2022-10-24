package controller.input;

import java.util.Scanner;

import controller.exception.ExceptionNumber;
import view.InputView;

public class InputVendingCoins {
	static InputView inputView = new InputView();
	static ExceptionNumber exceptionNumber = new ExceptionNumber();

	static Scanner sc = new Scanner(System.in);

	private String inputVendingCoins() {
		inputView.SumOfCoinsInputMention();
		return sc.nextLine();
	}

	public int getVendingCoins() {
		while (true) {
			try {
				String input = inputVendingCoins();
				exceptionNumber.isNumber(input);
				exceptionNumber.isStartNumZero(input);
				exceptionNumber.isTenMultiple(input);
				return Integer.parseInt(input);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// private String getInputBeverageInfo() {
	// 	inputView.BeverageInfoInputMention();
	// 	return sc.nextLine();
	// }
	//
	// public String inputBeverageInfo() {
	// 	while (true) {
	// 		try {
	// 			String inputString = getInputBeverageInfo();
	// 			exceptionString.isLastSemicolone(inputString);
	// 			exceptionString.isValidString(inputString);
	// 			return inputString;
	// 		} catch (IllegalArgumentException e) {
	// 			System.out.println(e.getMessage());
	// 		}
	// 	}
	// }
	//
	// public Map<Beverage, Integer> getBeverageInfos(String inputString) {
	// 	Map<Beverage, Integer> beverageInfoMap = new HashMap<>();
	// 	String[] beverageInfoArr = inputString.split(";");
	// 	getBeverageInfo(beverageInfoMap, beverageInfoArr);
	//
	// 	return beverageInfoMap;
	// }
	//
	// private void getBeverageInfo(Map<Beverage, Integer> beverageInfoMap, String[] beverageInfoArr) {
	// 	for (String beverageInfos : beverageInfoArr) {
	// 		String[] beverageInfo = getBeverageInfo(beverageInfos);
	// 		String name = beverageInfo[0];
	// 		int price = Integer.parseInt(beverageInfo[1]);
	// 		int count = Integer.parseInt(beverageInfo[2]);
	// 		Beverage beverage = new Beverage(name, price);
	// 		beverageInfoMap.put(beverage, count);
	// 	}
	// }
	//
	// public String[] getBeverageInfo(String beverageInfo) {
	// 	String regExp = "[\\[\\]]";
	// 	return beverageInfo.replaceAll(regExp, "").trim().split(",");
	// }

}
