package DependencyMethods;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DependencyMethodsDemo {

	
	@Test(priority=1)
	void openapp()
	{
		 Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,  dependsOnMethods= {"login","search"})
	void advsearvh()
	{
	   Assert.assertTrue(true);
	}
	
	@Test(priority=4,  dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
	
	
	
	
	
}
