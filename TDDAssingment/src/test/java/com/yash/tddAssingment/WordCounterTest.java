package com.yash.tddAssingment;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.yash.tddAssingmn.WordCounter;

public class WordCounterTest {
WordCounter wordCounter = new WordCounter();
	
	@Test
	public void shouldReturnCollectionOfUniqueWordsWhenStringContainsSpaceAsDelimiter() {
		Map<String,Long> expected = new HashMap<String,Long>();
		
		Map<String,Long> actual = wordCounter.getUnique("boom bang boom");
		expected.put("boom", 2L);
		expected.put("bang", 1L);

		assertEquals(expected, actual);
	}
	

}
