import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
	public static void main(String[] args) {
		System.out.println(getDefaultValue());
	}

	private static boolean getDefaultValue() {
		final String REGEX_GET_WORD = "[\\]](.*?)[\\[]";
		String content = "[sdfad];[adsfas];[adsfas]";

		Pattern pattern = Pattern.compile(REGEX_GET_WORD);
		Matcher matcher = pattern.matcher(content);
		while (matcher.find()) {
			if (!matcher.group(1).equals(";")) {
				return false;
			}
		}
		return true;
	}
}
