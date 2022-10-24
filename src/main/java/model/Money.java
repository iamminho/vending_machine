package model;

public class Money {
	private int money;

	public Money(int money) {
		this.money = money;
	}

	public void setMoney(int payment) {
		this.money -= payment;
	}

	public int getMoney() {
		return this.money;
	}
}
