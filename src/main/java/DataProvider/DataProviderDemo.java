package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	
	{
	    driver= new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   }
	
	
	@Test(dataProvider="dp")
	void testlogin(String email,String pwd) throws InterruptedException
	{
	 driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("pavanol123@gmail.com");
	 driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
	 driver.findElement(By.xpath("//input[@value='Login']")).click();
	 Thread.sleep(2000);
	/* boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
	 if(status==true)
	 {
		 driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).click();
		 driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")).click();
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Assert.fail();
	 }	*/

	} 
	 
	
	 @AfterClass
	 void teardown()
	 {
		 driver.close();
	 }
	 
	 
	 @DataProvider(name="dp", indices= {0,1})
	 Object[][] logindata()
	 {
		 Object data[] [] = {
				             {"abc@gmail.com","test@123"},
				             {"xyz@gmail.com","test@123"},
				             {"john@gmai.com","test@123"},
				             {"pavanol123@gmail.com","test@123"},
				             {"joncanedy@gmail.com","test@123"}
				           };
		return data;
		 
		 
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
}
