package TestNGDemo;

import org.testng.annotations.Test;

public class TestDemo {

	@Test
	void Openurl()
	{
		System.out.println("opening the web application ");
		
	}
	@Test
	void Login()   
	{
		System.out.println("Login into the page ");

	}
	
	@Test
	void logout()
	{
		System.out.println("Log out from application");
	}
}
