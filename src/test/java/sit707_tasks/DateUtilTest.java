package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "222590652";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Wenzong Xuan";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testCase1B() {
		DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("Date should increment to 2, 6, 1994 >" + date);
	    date.increment();
	    System.out.println(date);
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testCase2B() {
		DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("Should be 3, 6, 1994 >" + date);
	    date.increment();
	    System.out.println(date);
		Assert.assertEquals(3, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testCase3B() {
		DateUtil date = new DateUtil(15, 6, 1994);
	    System.out.println("Should be 16, 6, 1994 >" + date);
	    date.increment();
	    System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testCase4B() {
		DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("Should be 1, 7, 1994 >" + date);
	    date.increment();
	    System.out.println(date);
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(7, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testCase5B() {
		try {
			new DateUtil(31, 6, 1994);
			Assert.fail("Should have thrown an invalid date RuntimeException");
		} catch (RuntimeException e) {
			Assert.assertEquals("Invalid day: 31, max day: 30", e.getMessage());
		}
	}
	
	@Test
	public void testCase6B() {
		DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("Should be 16, 1, 1994 >" + date);
	    date.increment();
	    System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testCase7B() {
		DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("Should be 16, 2, 1994 >" + date);
	    date.increment();
	    System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testCase8B() {
		DateUtil date = new DateUtil(15, 11, 1994);
	    System.out.println("Should be 16, 11, 1994 >" + date);
	    date.increment();
	    System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(11, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testCase9B() {
		DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("Should be 16, 12, 1994 >" + date);
	    date.increment();
	    System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testCase10B() {
		DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("Should be 16, 6, 1700 >" + date);
	    date.increment();
	    System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1700, date.getYear());
	}
	
	@Test
	public void testCase11B() {
		DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("Should be 16, 6, 1701 >" + date);
	    date.increment();
	    System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1701, date.getYear());
	}
	
	@Test
	public void testCase12B() {
		DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("Should be 16, 6, 2023 >" + date);
	    date.increment();
	    System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void testCase13B() {
		DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("Should be 16, 6, 2024 >" + date);
	    date.increment();
	    System.out.println(date);
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
	public void testJan2024() {
		DateUtil date = new DateUtil(15, 1, 2024);
	    System.out.println("Should be 16, 1, 2024 >" + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testFeb2024() {
		DateUtil date = new DateUtil(15, 2, 2024);
	    System.out.println("Should be 16, 2, 2024 >" + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMar2024() {
		DateUtil date = new DateUtil(15, 3, 2024);
	    System.out.println("Should be 16, 3, 2024 >" + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testApr2024() {
		DateUtil date = new DateUtil(15, 4, 2024);
	    System.out.println("Should be 16, 4, 2024 >" + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMay2024() {
		DateUtil date = new DateUtil(15, 5, 2024);
	    System.out.println("Should be 16, 5, 2024 >" + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testJul2024() {
		DateUtil date = new DateUtil(15, 7, 2024);
	    System.out.println("Should be 16, 7, 2024 >" + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testAug2024() {
		DateUtil date = new DateUtil(15, 8, 2024);
	    System.out.println("Should be 16, 8, 2024 >" + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(8, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testSep2024() {
		DateUtil date = new DateUtil(15, 9, 2024);
	    System.out.println("Should be 16, 9, 2024 >" + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testOct2024() {
		DateUtil date = new DateUtil(15, 10, 2024);
	    System.out.println("Should be 16, 10, 2024 >" + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(10, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testNov2024() {
		DateUtil date = new DateUtil(15, 11, 2024);
	    System.out.println("Should be 16, 11, 2024 >" + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testDec2024() {
		DateUtil date = new DateUtil(15, 12, 2024);
	    System.out.println("Should be 16, 12, 2024 >" + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test 
	//leap year
	public void testLeapYearFebruary28ShouldIncrementToFebruary29() {
		DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("February28ShouldIncrementToFebruary29 >" + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(29, date.getDay());
	}
}
