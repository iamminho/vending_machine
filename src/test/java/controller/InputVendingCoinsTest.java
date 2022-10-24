package controller;

import java.util.Map;

import org.junit.jupiter.api.Test;

import controller.input.InputVendingCoins;
import model.Beverage;

class InputVendingCoinsTest {

	@Test
	void getBeverageInfoTest() {
		//given
		InputVendingCoins inputVendingCoins = new InputVendingCoins();
		String beverageInfo = "[콜라, 1500, 20]";

		//when
		String[] result = inputVendingCoins.getBeverageInfo(beverageInfo);

		//then
		for (String res : result) {
			System.out.println(res);
		}
	}

	@Test
	void getBeverageInfosTest() {
		//given
		InputVendingCoins inputVendingCoins = new InputVendingCoins();
		String inputString = "[cola,1500,20];[soda,2000,13]";

		//when
		Map<Beverage, Integer> result = inputVendingCoins.getBeverageInfos(inputString);

		//then
		System.out.println(result);
	}
}
