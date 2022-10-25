package view;

import model.Coin;

public class OutputView {
	private static final String VENDINGMACHINE_HAVE_COINS = "자판기가 보유한 동전";
	private static final String VENDINGMACHINE_GIVE_CHANGE = "잔돈";

	public void printHaveCoins() {
		System.out.println("");
		System.out.println(VENDINGMACHINE_HAVE_COINS);
		for (Coin coin : Coin.values()) {
			System.out.println(coin.getAmount() + "원" + " - " + coin.getCount() + "개");
		}
	}

	public void printHaveMoney(int money) {
		System.out.println("");
		System.out.println("투입 금액: " + money + "원");
	}

	public void printChange() {
		System.out.println(VENDINGMACHINE_GIVE_CHANGE);
		for (Coin coin : Coin.values()) {
			if (coin.getCount() != 0) {
				System.out.println(coin.getAmount() + "원" + " - " + coin.getCount() + "개");
			}
		}
	}
}
