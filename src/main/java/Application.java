import controller.input.InputBeverage;
import controller.input.InputVendingCoins;
import model.Beverages;

public class Application {
	static InputVendingCoins inputVendingCoins = new InputVendingCoins();

	public static void main(String[] args) {
		InputBeverage inputBeverage = new InputBeverage();
		Beverages beverages = new Beverages(inputBeverage.inputBeverageInfo());

		System.out.println(beverages.getBeverages());
	}
}
