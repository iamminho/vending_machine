package model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoinTest {

	@Test
	void getAmount() {

		for (Coin coin : Coin.values()) {
			assertThat(coin.getAmount()).isEqualTo(coin.getAmount());
		}

	}

	@Test
	void setCount() {
	}

	@Test
	void values() {
	}

	@Test
	void valueOf() {
	}
}
