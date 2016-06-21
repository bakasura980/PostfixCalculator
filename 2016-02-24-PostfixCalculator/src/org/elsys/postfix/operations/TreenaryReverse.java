package org.elsys.postfix.operations;

import org.elsys.postfix.Calculator;

public class TreenaryReverse extends TreenaryOperation {

	public TreenaryReverse(Calculator calculator, String token) {
		super(calculator, token);
	}

	@Override
	public double reverseCalculate(double number1, double number2, double number3) {
		return -(number1 * number2 * number3);
	}
}