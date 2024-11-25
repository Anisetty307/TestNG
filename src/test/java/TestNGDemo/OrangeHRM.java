package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
  
	WebDriver driver;
	
	@Test(priority=1)
	void open()
	{
	 driver=new ChromeDriver();
	
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	//@Test (priority=2)
	//void testlogo()
	
	{
		boolean status= driver.findElement(By.xpath("")).isSelected();
		System.out.println("logo is displayed:"+status);
	}
	
  @Test(priority=3)
   void testlogin()
   {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
   }
  
 @Test(priority=3)
  void closeapp()   
  {
  // driver.quit();
	  
  }
  
  
  
}
