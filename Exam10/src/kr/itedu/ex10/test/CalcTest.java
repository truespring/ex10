package kr.itedu.ex10.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
//		int result = Calc.sum(1, 2);
//		Assert.assertEquals(3, result);
//		result = Calc.sum(10, 20);
//		Assert.assertEquals(30, result);
//		result = Calc.sum(11, 22);
//		Assert.assertEquals(33, result);
		
		int n1 = 10;
		int n2 = 20;
		Assert.assertEquals(n1 + n2, Calc.sum(n1, n2));
		
		n1 = 13;
		n2 = 99;
		Assert.assertEquals(n1 + n2, Calc.sum(n1, n2));
		
		n1 = 1;
		n2 = 1;
		Assert.assertEquals(n1 + n2, Calc.sum(n1, n2));
	}
	

}
