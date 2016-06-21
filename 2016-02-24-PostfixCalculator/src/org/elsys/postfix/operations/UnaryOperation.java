package org.elsys.postfix.operations;

import java.util.List;

import org.elsys.postfix.Calculator;

public abstract class UnaryOperation extends AbstractOperation implements Operation {

	public UnaryOperation(Calculator calculator, String token) {
		super(calculator, token);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculate() {
		List<Double> list = Calculate(1);
		double result = modulCalculate(list.get(0));
		getCalculator().addValue(result);
		System.out.println(result);
	}
	
	public abstract double modulCalculate(double value1);

}