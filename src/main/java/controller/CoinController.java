package controller;

import model.Coin;

public class CoinController {
	public void setCoinsCnt(int inputMoney) {
		int coinsSum = inputMoney;
		for (Coin coin : Coin.values()) {
			int maxRandomRange = getMaxRandomRange(coinsSum, coin);
			int randomNum = getRandomNum(maxRandomRange, coin);
			coinsSum -= randomNum * coin.getAmount();
			setCoinCnt(coin, randomNum);
		}
	}

	int getMaxRandomRange(int coinsSum, Coin coin) {
		int amount = coin.getAmount();
		return coinsSum / amount;
	}

	int getRandomNum(int maxRandomRange, Coin coin) {
		if (coin.getAmount() == 10) {
			return maxRandomRange;
		}
		return (int)(Math.random() * (maxRandomRange + 1));
	}

	void setCoinCnt(Coin coin, int randomNum) {
		coin.setCount(randomNum);
	}
}
