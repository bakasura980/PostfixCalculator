package org.elsys.postfix.operations;

import java.util.ArrayList;
import java.util.List;

import org.elsys.postfix.Calculator;

public class CalculateOperation extends AbstractOperation implements Operation {

	public CalculateOperation(Calculator calculator, String token) {
		super(calculator, token);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Double> Calculate(int numberofcalculations){
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < numberofcalculations; i++) {
			list.add(getCalculator().popValue());
		}
		return list;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
	}
}