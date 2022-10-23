import controller.ExceptionString;

public class Application {

	public static void main(String[] args) {

		// String regExp = "\\[[^\\[,\\]]+,\\d+,\\d+\\]$";
		// String ex = "[포카리,400,32]";
		// if (ex.matches(regExp))
		// 	System.out.println("yes");
		// else
		// 	System.out.println("no");

		ExceptionString exceptionString = new ExceptionString();

		String str = "[사이다,1500,2];[콜라,01200,3]";
		try {
			exceptionString.isValidString(str);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
}
