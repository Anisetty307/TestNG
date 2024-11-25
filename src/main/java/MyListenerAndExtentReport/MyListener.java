package MyListenerAndExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onStart(ITestContext context) {
	   
		System.out.println("On start");
	  }
	
	public  void onTestStart(ITestResult result) {
	    
		System.out.println("on Test start");
	  }
	
	public void onTestSuccess(ITestResult result) {
	
		System.out.println("On test succcess");
	}
	
	
	public void onTestFailure(ITestResult result) {
	     	  
		System.out.println("On test Failure ");
		}
	public void onTestSkipped(ITestResult result) {
	    
		System.out.println("On test skipped ");
	  }
	public void onFinish(ITestContext context) {
	    
		System.out.println("On Finish");
	  }
	
	
}
