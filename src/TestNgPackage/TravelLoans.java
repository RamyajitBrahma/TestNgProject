package TestNgPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TravelLoans {

	@Test
    public void testcase1Travel() {
		System.out.println("testcase1 of Travel Loans");
		
	}
	/*
	@Test(dataProvider="getUsernamePsswrd")//cannot use dataprovider fromk different class if it is not present in this class
    public void dataProviderFromDiffClass() {
		System.out.println("testcase1 of Travel Loans");
		
	}*/
	@Test(groups= {"Sanity pack"})
   public void testcase2Travel() {
		//TestNgDay1 tc1Obj = new TestNgDay1();
		//tc1Obj.testcase1();
		System.out.println("testcase2 of travel Loans");
	}
	
	@Parameters({"GlobalURL"})
	@Test
	   public void testcase3Travel(String testglobURL) {
			//TestNgDay1 tc1Obj = new TestNgDay1();
			//tc1Obj.testcase1();
			System.out.println("testcase3 of travel Loans"+testglobURL);
		}

     @BeforeMethod
	   public void methodPreReq() {
			//TestNgDay1 tc1Obj = new TestNgDay1();
			//tc1Obj.testcase1();
			System.out.println("Pre Req of every method");
		}
     

}
