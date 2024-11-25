package FlowOfTestNG;

import org.testng.annotations.*;

public class C3 {

	@Test
	void pqr()
	{
		System.out.println("This is pqr form C3");
	}
	
	@BeforeSuite
	void BS()
	{
	  System.out.println("This is Before Suite");
	}
	
	@AfterSuite
	void AS()
	{
	  System.out.println("This is After Suite");
	}
 
	
}
