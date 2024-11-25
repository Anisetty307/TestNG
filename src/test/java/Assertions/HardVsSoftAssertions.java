package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class HardVsSoftAssertions {

	//SoftAssert sa; // we can create the variable in class level 

 @Test
/*  void test_hard() 
  {
	System.out.println("start");  
	
	Assert.assertEquals(1, 2);
	
	System.out.println("Finish");
  }  */

  void test_soft()
  {
	 System.out.println("start"); 
	 
	 SoftAssert sa= new SoftAssert();
	 
	  sa.assertEquals(1, 2);
	  
	  System.out.println("Finish");
	  
	  sa.assertAll();  //mandaoty 
	 
	 
	 
	 
  }





}
