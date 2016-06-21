package org.elsys.postfix.operations;

import java.util.List;

import org.elsys.postfix.Calculator;

public interface Operation {

	void calculate();
	
	Calculator getCalculator();
	
	String getToken();
}
