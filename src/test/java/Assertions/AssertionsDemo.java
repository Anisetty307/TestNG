package Assertions;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertionsDemo {

   @Test
   
   void testtitle()
   {
	   String exp_title="OpenCart";
	   String Act_title="OpenCart";
	/*   if(exp_title.equals(Act_title))
	   {
		System.out.println("Test is passed");	  
   }
	   else 
	   {
		  System.out.println("Test is failed");
	   }
   
	Assert.assertEquals(exp_title,Act_title ); */
	
	
	   if(exp_title.equals(Act_title))
	   {
		System.out.println("Test is passed");	  
	    Assert.assertTrue(true);
       }
	   else 
	   {
		  System.out.println("Test is failed");
		  Assert.assertTrue(false);
	   }
	
	
   }
}
