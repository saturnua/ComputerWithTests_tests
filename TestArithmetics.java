package test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import myPack.CalculatorWithSwitch;
import myPack.Computer;

public class TestArithmetics {
	
	private double res;

	@Before
	public void before(){
	res = 0;	
	}
	
	
	@Test
	public void testSum(){
		CalculatorWithSwitch calc = new CalculatorWithSwitch();
		res = calc.getSum(5, 8);
		Assert.assertTrue(res==(5+8));
	}
	
	@Test
	public void testOparetion(){
		int s = CalculatorWithSwitch.getOperation("+");
		Assert.assertFalse(s == 2);
	}
	
	@AfterClass
	public static void after(){
		System.out.println("Тесты закончены");	
	}
	
	@Test
	public void testPowerSwitch(){
		Computer.powerSwitch(2);      //Only for test. That test not doing any good job :)
	}

}
