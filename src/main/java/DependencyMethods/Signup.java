package DependencyMethods;

import org.testng.annotations.Test;

public class Signup {
	
	
	@Test(priority=1, groups= {"regression"})
	void signupemail()
	{
		System.out.println("This is signup by email");
	}
	
	@Test (priority=2, groups= {"regression"})
	void signupfacebook()
	{
		System.out.println("This is signup by facebook");
	}
	
	@Test(priority=3, groups= {"regression"})
	void signuptwitter()
	{
		System.out.println("This is signup by Twitter");
	}

}
