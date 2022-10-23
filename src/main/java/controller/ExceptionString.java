package controller;

public class ExceptionString {
	private static final String INVALID_SEMICOLNE = "[ERROR] 세미콜론은 상품정보 사이에만 입력이 가능합니다.";
	private static final String INVALID_FORM = "[ERROR] 입력형식은 [문자, 숫자, 숫자] 입니다.";
	private static final String INVALID_NUMBER = "[ERROR] 0을 제외하고는 맨 앞자리에 0이 올 수 없습니다.";
	private static ExceptionNumber exceptionNumber = new ExceptionNumber();

	public void isLastSemicolone(String inputGoodsInfos) {
		if (inputGoodsInfos.charAt(inputGoodsInfos.length() - 1) == ';') {
			throw new IllegalArgumentException(INVALID_SEMICOLNE);
		}
	}

	public void isValidString(String inputGoodsInfos) {
		String[] goodsInfosArr = inputGoodsInfos.split(";");
		for (String goodsInfo : goodsInfosArr) {
			isCollectForm(goodsInfo);
			isCollectNum(goodsInfo);
		}
	}

	public void isCollectForm(String goodsInfo) {
		String regExp = "\\[[^\\[,\\]]+,\\d+,\\d+\\]$";
		if (!goodsInfo.matches(regExp)) {
			throw new IllegalArgumentException(INVALID_FORM);
		}
	}

	public void isCollectNum(String goodsInfo) {
		String[] goodsInfoArr = goodsInfo.split(",");
		String price = goodsInfoArr[1];
		String count = goodsInfoArr[2];

		exceptionNumber.isTenMultiple(price);
		isStartNumZero(price, count);
	}

	public void isStartNumZero(String price, String count) {
		if (price.charAt(0) == '0') {
			throw new IllegalArgumentException(INVALID_NUMBER);
		}
		exceptionNumber.isStartNumZero(count);
	}

}
