package org.elsys.postfix.operations;

import java.util.ArrayList;
import java.util.List;

import org.elsys.postfix.Calculator;

public abstract class AbstractOperation implements Operation {

	private Calculator calculator;

	private String token;

	public AbstractOperation(Calculator calculator, String token) {
		this.calculator = calculator;
		this.token = token;
	}
	
	public List<Double> Calculate(int numbersofvalues){
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < numbersofvalues; i++) {
			list.add(getCalculator().popValue());
		}
		return list;
	}
	
	@Override
	public Calculator getCalculator() {
		return calculator;
	}

	@Override
	public String getToken() {
		return token;
	}

}
