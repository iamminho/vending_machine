package controller;

import model.Coin;
import model.Money;

public class Change {

	public void setChange(Money money) {
		for (Coin coin : Coin.values()) {
			int maxCnt = getMaxCnt(money, coin);
			int count = getCnt(maxCnt, coin);
			coin.setCount(count);
			money.setMoney(count * coin.getAmount());
		}
	}

	private int getMaxCnt(Money money, Coin coin) {
		return money.getMoney() / coin.getAmount();
	}

	private int getCnt(int maxCnt, Coin coin) {
		if (maxCnt <= coin.getCount()) {
			return maxCnt;
		}
		return coin.getCount();
	}
}
