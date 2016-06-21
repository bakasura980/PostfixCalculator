package org.elsys.postfix.operations;

import java.util.List;

import org.elsys.postfix.Calculator;

public abstract class TreenaryOperation extends AbstractOperation implements Operation {

	public TreenaryOperation(Calculator calculator, String token) {
		super(calculator, token);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculate() {
		List<Double> list = Calculate(3);
		double result = reverseCalculate(list.get(0),list.get(1),list.get(2));
		getCalculator().addValue(result);
		System.out.println(result);
	}
	
	public abstract double reverseCalculate(double number1, double number2, double number3);

}