package TestNgPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenersCls implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Printing this after each test case fails - FAILED TCs name is "+arg0.getName());
		System.out.println("Printing this after each test case fails - FAILED Class name is "+arg0.getClass());//this is not the class where the test case belongs
		System.out.println("Printing this after each test case fails - FAILED Test name is "+arg0.getTestName());// this is not the test name in the testng file
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Printing this after each test case SKIPPED");
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Printing this after each test case PASSES");
	}

}
