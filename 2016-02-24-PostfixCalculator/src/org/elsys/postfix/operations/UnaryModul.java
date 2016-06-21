package org.elsys.postfix.operations;

import org.elsys.postfix.Calculator;

public class UnaryModul extends UnaryOperation {

	public UnaryModul(Calculator calculator, String token) {
		super(calculator, token);
	}

	@Override
	public double modulCalculate(double operand) {
		return Math.abs(operand);
	}
}