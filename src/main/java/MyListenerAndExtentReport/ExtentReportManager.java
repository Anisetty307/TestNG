package MyListenerAndExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter; // UI of the report
	public ExtentReports extent; // populated common info on the reports 
	public ExtentTest test;  //creating test case entries in the report and update status of the test method
	
	public void onStart(ITestContext context) {
		
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+("/Reportss/myreports.html")); 
		sparkReporter.config().setDocumentTitle("Automation");  //Title of reports
		sparkReporter.config().setReportName("Functinal");  // name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer", "local Host");
		extent.setSystemInfo("Env", "QA");
		extent.setSystemInfo("TestName", "Ravikanth");
		extent.setSystemInfo("OS", "win11");
		extent.setSystemInfo("Brower name", "Chrome");
	}	
		public void onTestSuccess(ITestResult result)
		{
			test=extent.createTest(result.getName());  //created a new entry in the reports
			test.log(Status.PASS, "Test case is passed is" +result.getName());  // update the Status p/f/s
			
		}
		
	  public void onTestFailure(ITestResult result)
	  {
		  test=extent.createTest(result.getName());
		  test.log(Status.FAIL , "Test case is failed : "+result.getName());
		  test.log(Status.FAIL, "Test case is failed casuse is: "+ result.getThrowable());
		  
	  }
	
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case skipped is :"+result.getName());
		
	}
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
	
	
}
