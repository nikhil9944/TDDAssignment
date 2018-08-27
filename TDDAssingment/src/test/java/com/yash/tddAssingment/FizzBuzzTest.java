package com.yash.tddAssingment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yash.tddAssingmn.FizzBuzz;

public class FizzBuzzTest {
	FizzBuzz fizzBuzzObj=new FizzBuzz();
	
	@Test
	public void testWithNumberIsDividableBy3(){
		assertEquals("Fizz", fizzBuzzObj.fizzBuzzCalculator(9));
	}
	@Test
	public void testWithNumberIsDividableBy5(){
		assertEquals("Buzz", fizzBuzzObj.fizzBuzzCalculator(10));
	}
	@Test
	public void testWithNumberIsDividableBy3An5(){
		assertEquals("FizzBuzz", fizzBuzzObj.fizzBuzzCalculator(15));
	}
	@Test
	public void testOtherNumbers(){
		assertEquals("4", fizzBuzzObj.fizzBuzzCalculator(4));
	}
}
