package test;

import myPack.CalculatorWithSwitch;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;


public class MockTest {
	
	@Test
	public void methodCallCheck(){
		
	CalculatorWithSwitch mockedObject = mock(CalculatorWithSwitch.class);
	mockedObject.getSum(4,5);
	//check whether the call 
	verify(mockedObject).getSum(4, 5);
	}
	
	@Test
	public void methodCallCheck_stub(){
		
	CalculatorWithSwitch mockedObject = mock(CalculatorWithSwitch.class);
	
	//call with my result
	stub(mockedObject.getSum(4, 5)).toReturn(8.0);
	assertEquals(9.0, mockedObject.getSum(4, 5), 0);
	}
	
	@Test(expected = Exception.class)
	public void methodWithExeption(){
		CalculatorWithSwitch mockedObject = mock(CalculatorWithSwitch.class);
		//i wants exeption buttt its no . WHY??????
		when(mockedObject.getSum(anyDouble(),anyDouble())).thenThrow(new Exception());
		mockedObject.getSum(6, 6);
	}
	@Test
	public void methodQuantityCalls(){
		CalculatorWithSwitch mockedObject = mock(CalculatorWithSwitch.class);
		
		mockedObject.getSum(6, 6);
		mockedObject.getSum(6, 6);
		mockedObject.getSum(6, 6);
		//check quantity of calls function
		verify(mockedObject, times(3)).getSum(6, 6);
	}
	
	@Test
	public void verifyZeroInteractionsCheck(){
	CalculatorWithSwitch mockedObject = mock(CalculatorWithSwitch.class);
		
	//If i uncomment there will be error
	//mockedObject.getSum(6, 6);
	 verifyZeroInteractions(mockedObject);
	}
	
	
	
	
}

