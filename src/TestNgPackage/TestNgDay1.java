package TestNgPackage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDay1 {

	@Test(groups= {"Sanity pack"})
     public void testcase1() {
		System.out.println("testNG");
		
	}
	@Test
    public void testcase2() {
		TestNgDay1 tc1Obj = new TestNgDay1();
		tc1Obj.testcase1();
		tc1Obj.func1();
		System.out.println("testNG2");
		
	}
	
    public void func1() {
		System.out.println("justa func outside test annotation");
		
	}
    
	@Test(dataProvider="getUsernamePsswrd")
    public void testcase3(String Uname,String Pwd) {
		System.out.println("test case 3 udername : "+Uname);
		System.out.println("test case 3 Password : "+Pwd);
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("Pre Reeq for carand personal loans test  TestNgDay1 Class");
	}
    
    @DataProvider  //This is create a set of test data for which a specific test case will run ..if 3 test data set then that particular test case will run 3 times for 3 different set of data
    public Object[][] getUsernamePsswrd() {//This will make the test case run for 3 times with two sets of data each .. row is the no of times it will run
		Object[][] obj = new Object[3][2];
		
		obj[0][0]="Username 1 of 1st data";
		obj[0][1]="Password 1 of 1st data";		
		
		obj[1][0]="Username 1 of 2nd data";
		obj[1][1]="Password 1 of 2nd data";	
		
		obj[2][0]="Username 1 of 3rd data";
		obj[2][1]="Password 1 of 3rd data";	
		
		return obj;
			}

}
