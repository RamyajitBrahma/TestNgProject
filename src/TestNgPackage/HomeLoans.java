package TestNgPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeLoans {

	@Test
    public void testcase1() {
		System.out.println("testcase1 of Home Loans");
		
	}
	
	@AfterSuite
    public void lastonefunc() {
		System.out.println("will b executed at the end of suite");
		
	}
	
	@BeforeClass
    public void beforeClassfunc() {
		System.out.println("will b executed before home loans class");
		
	}
}
