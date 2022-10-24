package controller.exception;

public class ExceptionNumber {

	private static final String VALID_ONLY_NUMBER = "[ERROR] 숫자 입력만 가능합니다.";
	private static final String INVALID_NUMBER = "[ERROR] 0을 제외하고는 맨 앞자리에 0이 올 수 없습니다.";
	private static final String VALID_ONLY_TEN_MULTIPLE = "[ERROR] 10의 배수만 입력이 가능합니다.";

	public void isNumber(String inputNum) {
		String regExp = "^[0-9]+$";
		if (!inputNum.matches(regExp)) {
			throw new IllegalArgumentException(VALID_ONLY_NUMBER);
		}
	}

	public void isStartNumZero(String inputNum) {
		if (inputNum.length() > 1 && inputNum.charAt(0) == '0') {
			throw new IllegalArgumentException(INVALID_NUMBER);
		}
	}

	public void isTenMultiple(String inputNum) {
		int target = Integer.parseInt(inputNum);
		if (target % 10 != 0) {
			throw new IllegalArgumentException(VALID_ONLY_TEN_MULTIPLE);
		}
	}
}
