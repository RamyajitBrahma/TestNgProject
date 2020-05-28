package TestNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CarLoans {

	@Test
    public void testcase1Car() {
		System.out.println("testcase1 of Car Loans");
		Assert.assertTrue(false);
		System.out.println("testcase1 of Car Loans after failed step");//this step wojmt be execugyed as the second step in this test case is failing
	}
	@Test(groups= {"Sanity pack"})
   public void APItescase1()   {
		//TestNgDay1 tc1Obj = new TestNgDay1();
		//tc1Obj.testcase1();

		System.out.println("API test case 1");
	}
	
	
	@Test
	   public void firstAPItescase2() {
			//TestNgDay1 tc1Obj = new TestNgDay1();
			//tc1Obj.testcase1();
			System.out.println("API test case 2 ");
			

		}
	
	@Parameters({"GlobalURL","GlobalURL2"})
	@Test
	   public void testcase2Car(String globalURL,String globalURL2) {
			//TestNgDay1 tc1Obj = new TestNgDay1();
			//tc1Obj.testcase1();
			System.out.println("testcase2 of Car Loans");
			System.out.println("testcase2 of Car Loans global URL is " + globalURL);
			System.out.println("testcase2 of Car Loans second global URL is " + globalURL2);
		}
	
	@BeforeTest   //Test means the test in testNg XML under which many classes reside
	public void prerequisite() {
		System.out.println("Pre Reeq for carand personal loans test  car Loans Class");
	}
	
	@AfterTest
	public void closebrowser() {
		System.out.println("Close and delete cookies car and peronal loans Car Loans Class");
	}
	
	@BeforeMethod // Method means Test cases inside the Class where it is written , it has nothing to do with the testNg xml scope
	public void beforemethfunc() {
		System.out.println("Repeated bfr each test case of clas carloans");
	}
}
