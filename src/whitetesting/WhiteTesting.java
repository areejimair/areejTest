package whitetesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unitTesting.TestingTask;

class WhiteTesting {
	@BeforeEach
	void setUp()throws Exception{
		
	}
	@Test
	void test_NoNumbers() {
		TestingTask.findTwoLargestNumbers(new String[] {});
		String result=TestingTask.result;
		assertTrue(result.equals("No numbers"));
	}

	@Test
	void test_oneNumber() {
		TestingTask.findTwoLargestNumbers(new String[] {"1"});
		String result=TestingTask.result;
		String z=""+"1";
		assertTrue(result.equals(z));
	}
	
	@Test
	void test_twonumber() {
		TestingTask.findTwoLargestNumbers(new String[] { "10" , "20" });
		String result=TestingTask.result;
		String z="20,10";
		assertTrue(result.equals(z));
	}
	
	@Test
	void test_twonumber1() {
		TestingTask.findTwoLargestNumbers(new String[] { "200" , "10" });
		String result=TestingTask.result;
		String z="200,10";
		assertTrue(result.equals(z));
	}
	
	@Test
	void test_morethantwo() {
		TestingTask.findTwoLargestNumbers(new String[] { "10" , "1000", "30" });
		String result=TestingTask.result;
		String z="1000,30";
		assertTrue(result.equals(z));
	}
	
	@Test
	void test_morethantwo_obsisLess() {
		TestingTask.findTwoLargestNumbers(new String[] { "40" , "30", "70" });
		String result=TestingTask.result;
		String z="70,40";
		assertTrue(result.equals(z));
	}

	

}
