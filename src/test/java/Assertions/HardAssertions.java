package Assertions;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertions {
	
	@Test
	void test()
	{
	//	Assert.assertEquals("xyz", "ABC");
	//	Assert.assertEquals(123, 123);
	//	Assert.assertEquals(123, "ABC");
	//	Assert.assertEquals("123", 123);   // Considering as string so fails
	// Assert.assertNotSame(123, 123);	 // Fail
	// Assert.assertNotSame(123, 1234);	  // pass
		
	//  Assert.assertTrue(true);   // pass
	//  Assert.assertFalse(false);   // pass
	//  Assert.assertTrue(false);   //fail
		
	// Assert.assertTrue(1==2);	//fail
	// Assert.assertFalse(1==2);  // pass
		
	Assert.assertTrue(1==1);	 //pass
	  Assert.assertFalse(1==1);  // fails
		
		
		
		
	}

}
