package TestNgPackage;

import org.testng.annotations.Test;

public class helperannotations {
	@Test(dependsOnMethods= {"MobileTestCase1","WebTestCase1"})
    public void BPItestcase1() {
		System.out.println("BPI test case 1");
		
	}
	//dependsOnMethods="mobileTestCase1"
	@Test(dependsOnMethods= {"MobileTestCase1"})
    public void CPItestcase1() {
		System.out.println("CPI test case 1");
		
	}
	@Test(dependsOnMethods= {"MobileTestCase1"})
   public void APItescase2() {
		//TestNgDay1 tc1Obj = new TestNgDay1();
		//tc1Obj.testcase1();
		System.out.println("API test case 2");
	}
	
	@Test
	   public void MobileTestCase1() {
			//TestNgDay1 tc1Obj = new TestNgDay1();
			//tc1Obj.testcase1();
			System.out.println("Mobile test case 1");
		}
	
	@Test(timeOut=4000)  //setting implicit timeout of 4000 for thi test case
	   public void WebTestCase1() {
			//TestNgDay1 tc1Obj = new TestNgDay1();
			//tc1Obj.testcase1();
			System.out.println("Web test case 2");
		}
	
	@Test(enabled=false)
	   public void ommit() {
			//TestNgDay1 tc1Obj = new TestNgDay1();
			//tc1Obj.testcase1();
			System.out.println("Web test case 2");
		}
}
