package kr.itedu.ex10.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		int result1 = Calc.sum(1, 2);
		Assert.assertEquals(3, result1);
		int result2 = Calc.sum(10, 20);
		Assert.assertEquals(30, result2);
		int result3 = Calc.sum(11, 22);
		Assert.assertEquals(33, result3);
	}
	

}
