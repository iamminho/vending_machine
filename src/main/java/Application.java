import controller.VendingMachine;
import model.Coin;

public class Application {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.setCoinsCnt(450);
		for (Coin coin : Coin.values()) {
			System.out.println(coin.getAmount() + " " + coin.getCount());
		}
	}
}
