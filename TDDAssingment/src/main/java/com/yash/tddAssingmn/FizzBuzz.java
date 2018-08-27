package com.yash.tddAssingmn;

import java.util.Optional;

public class FizzBuzz {
	public String fizzBuzzCalculator(int inputNumber) {
		return Optional.of(inputNumber).map(i -> {
			if (i % 15 == 0) {
				return "FizzBuzz";
			} else if (i % 3 == 0) {
				return "Fizz";
			} else if (i % 5 == 0) {
				return "Buzz";
			} else {
				return Integer.toString(inputNumber);
			}

		}).get();
	}

}
