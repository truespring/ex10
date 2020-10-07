package kr.itedu.ex10.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		int result = Calc.sum(1, 2);
		Assert.assertEquals(3, result);
		result = Calc.sum(10, 20);
		Assert.assertEquals(30, result);
		result = Calc.sum(11, 22);
		Assert.assertEquals(33, result);
	}
	

}
