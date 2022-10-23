import controller.Input;

public class Application {
	public static void main(String[] args) {
		Input input = new Input();
		int result = input.inputSumOfCoins();
		System.out.println(result);
	}
}
