package Day2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListerner implements ITestListener{

	
	public void onStart(ITestContext context)
	{
	System.out.println("Test started");
	}
	public void onFinish(ITestContext context)
	{
		System.out.println("Test Completed");
	
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Passed");
	
	}
	
}
