package com.hexaware.orangehrm;

import org.testng.annotations.Test;

public class SumTesting {


	@Test(priority=2)
	public void sum() {
    System.out.println("Sum function");
	}
	
	@Test(priority=1) 
	public void mul() {
		System.out.println("mul function");
		//return c;
	}
	
	@Test(dependsOnMethods="mul") 
	public void sub() {
		System.out.println("subtraction function");
	}
	
	@Test(groups= "Smoke")
	public void div() {
		System.out.println("division function");
	}
}
