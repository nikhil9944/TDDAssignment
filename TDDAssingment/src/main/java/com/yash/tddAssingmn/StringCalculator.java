package com.yash.tddAssingmn;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class StringCalculator {
	int result = 0;

	public int addEmptyString(String number) {
		if (number.isEmpty()) {
		}
		return result;
	}

	public int addOneNumber(String number) {
		if (!number.isEmpty()) {
			result = Integer.parseInt(number);
		}
		return result;
	}

	public int addTwoNumber(String number) {
		if (number.length() > 1 || number.length() < 3) {
			String[] inputString = number.split(",");
			int[] array = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
			for (int i : array) {
				result += i;
			}
		}
		return result;
	}

	public int addMultipleNumber(String number) {
		if (number.length() > 1 || number.length() < 6) {
			String[] inputString = number.split(",");
			int[] array = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
			for (int i : array) {
				result += i;
			}
		}
		return result;
	}

	public int addMultipleNumberWithNewLine(String number) {
		if (number.length() > 1 || number.length() < 6) {
			String[] inputString = number.split(",|\n");
			int[] array = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
			for (int i : array) {
				result += i;
			}
		}
		return result;
	}

	public int addDiffrentDelimeter(String input) {
		Integer sum = 0;

		if (input.length() != 0) {
			String delimiter = ",|\\n";
			if (input.startsWith("//")) {
				String[] split = input.split("\\n");
				delimiter = split[0].substring(2);
				input = split[1];
			}
			String[] numberList = input.split(delimiter);
			sum = Arrays.stream(numberList).map(s -> Integer.parseInt(s)).filter(n -> n <= 1000)
					.collect(Collectors.reducing((n1, n2) -> n1 + n2)).get();
		}

		return sum;
	}

	Logger logger = Logger.getLogger(StringCalculator.class.getName());

	public int addWithIgnoreBiggerThan1000Number(String input) {

		Integer sum = 0;

		if (input.length() != 0) {
			String delimiter = ",|\\n";
			if (input.startsWith("//")) {
				String[] split = input.split("\\n");
				delimiter = split[0].substring(2);
				input = split[1];
			}
			String[] numberList = input.split(delimiter);
			sum = Arrays.stream(numberList).map(s -> Integer.parseInt(s)).filter(n -> n <= 1000)
					.collect(Collectors.reducing((n1, n2) -> n1 + n2)).get();
		}
		logger.info(sum.toString());
		return sum;
	}

	public int addWithLogger(String input) {

		if (input.length() > 1) {
			String[] inputString = input.split(",");
			int[] array = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
			for (int i : array) {
				result += i;

			}
			logger.info(String.valueOf(result));
		}
		return result;
	}
	
	
	public int addWithNegative(String number){
		if (!number.isEmpty()) {
			String[] inputString = number.split(",");
			int[] array = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
			for (int i : array) {
				if(i<0){
					throw new IllegalArgumentException();		
				}
				result += i;
				}
			}
		
		
		return result;
		
	}
}
