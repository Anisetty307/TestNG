package DependencyMethods;

import org.testng.annotations.Test;

public class Payments {
	
	@Test(priority=1, groups= {"sanity","regression"}) 
	void paymentsbyrupees()
	{
		System.out.println("payment by rupees");
	}

	@Test(priority=2, groups= {"sanity","regression"}) 
	void paymentbyDollar()
	{
		System.out.println("Payment by Dollar");
	}
}
