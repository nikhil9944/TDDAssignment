package com.yash.tddAssingment;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.yash.tddAssingmn.StringCalculator;

@RunWith(MockitoJUnitRunner.class)
public class StringCalculatorTest {
	@InjectMocks
	StringCalculator stringCalculator;
	@Mock
	Logger logger;

	@Test
	public void TestAddWithEmptyStringReturnZero() {
		String number = "";
		int result = stringCalculator.addEmptyString(number);
		Assert.assertEquals(0, result);

	}

	@Test
	public void TestAddWithSingleNumberInStringReturnsTheNumber() {
		int result = stringCalculator.addOneNumber("1");
		Assert.assertEquals(1, result);
	}

	@Test
	public void TestAddWithTwoNumbersInStringReturnsTheTotal() {
		Assert.assertEquals(3, stringCalculator.addTwoNumber("1,2"));
	}

	@Test
	public void shouldRaiseExceptionOnNgative() {
		try{
			stringCalculator.addMultipleNumber("-1,-2");
		}catch(RuntimeException exception){
			//ok
		}
	}

	@Test
	public void TestAddWithMultipleNumberWithNewLineInStringReturnTheTotal() {
		Assert.assertEquals(15, stringCalculator.addMultipleNumberWithNewLine("1\n2,3\n4\n5"));
	}

	@Test
	public void TestAddWithDiffrentDelimeterInStringReturnTheTotal() {
		Assert.assertEquals(16, stringCalculator.addDiffrentDelimeter("//;\n11;2;3"));
	}

	@Test
	public void TestAddWithExcludingNumberBiggerThan1000() {
		Assert.assertEquals(102, stringCalculator.addWithIgnoreBiggerThan1000Number("100,2"));
	}

	@Test
	public void TestAddWithLoggerOutput() {
		Mockito.doNothing().when(logger).info(Mockito.any(String.class));
		stringCalculator.addWithLogger("12,13");
		Mockito.verify(logger).info(Mockito.any(String.class));
	}
	@Test
	public void shouldRaiseExceptionOnNegatives(){
		try{
			stringCalculator.addWithNegative("-1,-2,3,4");
		}catch(RuntimeException exception){
			System.out.println("Negative not allowed.");
		}
		
	}
}
