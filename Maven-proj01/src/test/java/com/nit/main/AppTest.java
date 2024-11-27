 package com.nit.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest 
{
	public void testsumwithpositive()
	{
      ArithmeticOperation app =new ArithmeticOperation();
      int actual = app.sum(10,20);
      int execepted =30;
      assertEquals(execepted,actual);
	}
}
