package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation2 {
  
	@BeforeClass()
	void login()
	{
		System.out.println("This is login");
  
  }
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search");
	}
	
	@Test(priority=2)
	void adsearch()
	{
	 System.out.println("This  is ad search");
	}
	
	@AfterClass()
	void logout()
	{
	System.out.println("This is logout");	
	}
	
	
	
	
	
	
	
	
}
