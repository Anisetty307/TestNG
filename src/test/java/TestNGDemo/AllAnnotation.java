package TestNGDemo;

import org.testng.annotations.*;

public class AllAnnotation {
	
	@BeforeSuite
	void BS()
	{
	  System.out.println("Before Suite");
	}

	@AfterSuite
	 void AS()
	{
	  System.out.println("After Suite");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("After SuiteEEEEEEE");
	}
  
	@Test
	 void abc()
	 {
		System.out.println("This is ABC");
	 }

	 @BeforeTest
	  void BT()
	  {
		 System.out.println("BeforeTest ");
	  }
		
		
	 @Test
	  void xyz()
	  {
		 System.out.println("This is XYZ");
	  }

	 @AfterTest 
	 void AT()
	 {
		 System.out.println(" Aftertest");
	 }
	
	 
	 @BeforeClass
	 void vc()
	 {
		 System.out.println("Before class ");
	 }
 
	 @AfterClass 
	 void AC() 
	 {
	   System.out.println(" After class "); 
	 }
	 
	 
	 @BeforeMethod
	 void BM()
	 {
		 System.out.println("Before method");
	 }
    
	 @AfterMethod
	 void AM()
	 {
		 System.out.println("After method");
	 }
	 
     @Test
     void PQR()
     {
    	 System.out.println("This is PQR");
     }


	
	
}
