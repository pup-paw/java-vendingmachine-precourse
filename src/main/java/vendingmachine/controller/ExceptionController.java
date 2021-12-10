package vendingmachine.controller;

import vendingmachine.util.Constant;

public class ExceptionController {

	public static void isInteger(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(Constant.ERROR_IS_NOT_INTEGER);
		}
	}

	public static void isPositive(int input) {
		if (input < 1) {
			throw new IllegalArgumentException(Constant.ERROR_IS_NOT_POSITIVE);
		}
	}

	public static void isMultipleOfTen(int input) {
		if (input % 10 != 0) {
			throw new IllegalArgumentException(Constant.ERROR_IS_NOT_MULTIPLE_OF_TEN);
		}
	}
}
