import controller.ExceptionString;
import controller.Input;

public class Application {
	static Input input = new Input();

	public static void main(String[] args) {

		// String regExp = "\\[[^\\[,\\]]+,\\d+,\\d+\\]$";
		// String ex = "[포카리,400,32]";
		// if (ex.matches(regExp))
		// 	System.out.println("yes");
		// else
		// 	System.out.println("no");

		ExceptionString exceptionString = new ExceptionString();

		String result = input.inputBeverageInfo();
		System.out.println(result);

	}
}
