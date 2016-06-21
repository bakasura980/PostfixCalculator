package org.elsys.postfix.operations.test;

import static org.junit.Assert.*;

import org.elsys.postfix.Calculator;
import org.elsys.postfix.operations.UnaryModul;
import org.elsys.postfix.operations.TreenaryReverse;
import org.elsys.postfix.operations.Operation;
import org.junit.Test;

public class UnaryTestCase {

	@Test
	public final void testUnaryModul() {
		// Arrange
		Calculator calculator = new Calculator();
		Operation modul = new UnaryModul(calculator, "abs()");
		
		// Act
		calculator.addOperation(modul);
		calculator.addValue(5);
		if (calculator.size() == 1) {
			modul.calculate();
			assertEquals(5, calculator.popValue(), 0.00001);
		}else{
			assertEquals(1, calculator.size(), 0.00001);
		}
	}

	@Test
	public final void testLessValues() {
		// Arrange
		Calculator calculator = new Calculator();
		Operation reverse = new TreenaryReverse(calculator, "*-*");
		
		// Act
		calculator.addOperation(reverse);
		calculator.addValue(1);
		calculator.addValue(2);
		
		if(calculator.size() == 3){
			reverse.calculate();
			assertEquals(-6, calculator.popValue(), 0.00001);
		}else{
			assertEquals(1, calculator.size(), 0.00001);
		}
	}
}
