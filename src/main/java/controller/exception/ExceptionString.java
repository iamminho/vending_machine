package controller.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionString {
	private static final String INVALID_LAST_ELEMENT = "[ERROR] 마지막 상품정보 뒤에는 어떠한 특수문자도 붙지 않습니다.";
	private static final String INVALID_FORM = "[ERROR] 입력형식은 [문자, 숫자, 숫자] 입니다.";
	private static final String INVALID_NUMBER = "[ERROR] 0을 제외하고는 맨 앞자리에 0이 올 수 없습니다.";
	private static final String INVALID_SPECIAL_SYMBOL = "[ERROR] 여는 대괄호와 닫는 대괄호 사이에는 세미콜론이 와야합니다.";

	private static ExceptionNumber exceptionNumber = new ExceptionNumber();

	public void isLastCloseBrackets(String inputGoodsInfos) {
		if (inputGoodsInfos.charAt(inputGoodsInfos.length() - 1) != ']') {
			throw new IllegalArgumentException(INVALID_LAST_ELEMENT);
		}
	}

	public void isBetweenSemiColone(String inputGoodsInfos) {
		final String regExp = "[\\]](.*?)[\\[]";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher((inputGoodsInfos));

		while (matcher.find()) {
			if (!matcher.group(1).equals(";")) {
				throw new IllegalArgumentException(INVALID_SPECIAL_SYMBOL);
			}
		}
	}

	public void isValidString(String inputGoodsInfos) {
		String[] goodsInfosArr = inputGoodsInfos.split(";");
		for (String goodsInfo : goodsInfosArr) {
			isCollectForm(goodsInfo);
			isCollectNum(goodsInfo);
		}
	}

	private void isCollectForm(String goodsInfo) {
		final String regExp = "\\[[^\\[,\\]]+,\\d+,\\d+\\]$";
		if (!goodsInfo.matches(regExp)) {
			throw new IllegalArgumentException(INVALID_FORM);
		}
	}

	private void isCollectNum(String goodsInfo) {
		String[] goodsInfoArr = goodsInfo.split(",");
		String price = goodsInfoArr[1];
		String count = goodsInfoArr[2];

		exceptionNumber.isTenMultiple(price);
		isStartNumZero(price, count);
	}

	private void isStartNumZero(String price, String count) {
		if (price.charAt(0) == '0') {
			throw new IllegalArgumentException(INVALID_NUMBER);
		}
		exceptionNumber.isStartNumZero(count);
	}

}
