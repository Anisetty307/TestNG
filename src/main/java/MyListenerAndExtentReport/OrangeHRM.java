package MyListenerAndExtentReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// @Listeners(MyListenerAndExtentReport.MyListener.class)
public class OrangeHRM {
// class 46// 
	WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void testlogo() throws InterruptedException
	{	
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
		System.out.println("Test Logo");
	}
	
	@Test(priority=2)
	void testtitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRRM");
		System.out.println("Test title");
	}
	
	@Test(priority=3, dependsOnMethods= {"testtitle"})
	void testurl()
	{
	Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("Test url");
	}
	
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
		
}
