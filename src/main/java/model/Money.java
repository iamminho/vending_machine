package model;

public class Money {
	private int money;

	public Money(int inputMoney) {
		this.money = inputMoney;
	}

	public void setMoney(int payment) {
		this.money -= payment;
	}

	public int getMoney() {
		return this.money;
	}
}
