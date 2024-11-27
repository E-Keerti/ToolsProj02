 package com.nit.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest 
{
	@Test
	public void testsumwithpositive()
	{
      ArithmeticOperation app =new ArithmeticOperation();
      int actual = app.sum(10,20);
      int execepted =30;
      assertEquals(execepted,actual);
	}
	@Test
	public void testWithNegative()
	{
		 ArithmeticOperation app =new ArithmeticOperation();
	      int actual = app.sum(-10,-20);
	      int execepted =-30;
	      assertEquals(execepted,actual);
		
	}
	
	@Test
	public void testwithMixedValues()
	{
		 ArithmeticOperation app =new ArithmeticOperation();
	      int actual = app.sum(10,-20);
	      int execepted =-10;
	      assertEquals(execepted,actual);
	}
}
