package Day2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HierarchyTest {
	
	
	@Test(priority=1)
	void sampleMethod9()
	{
		System.out.println("Test1");
	}
	@Test(priority=2)
	void sampleMethod10()
	{
		System.out.println("Test2");
	}
	@Test(priority=3)
	void sampleMethod11()
	{
		System.out.println("Test3");
	}
	@BeforeTest
	void sampleMethod5()
	{
		System.out.println("beforTest");
	}
	@AfterTest
	void sampleMethod6()
	{
		System.out.println("afterTest");
	}
	@BeforeClass
	void sampleMethod3()
	{
		System.out.println("beforeClass1");
	}
	@AfterClass
	void sampleMethod4()
	{
		System.out.println("AfterClass1");
	}
	@BeforeMethod
	void sampleMethod1()
	{
		System.out.println("beforeMethod1");
	}
	@AfterMethod
	void sampleMethod2()
	{
		System.out.println("AfterMethod1");
	}

	@BeforeSuite
	void sampleMethod7()
	{
		System.out.println("BforeSuite");
	}
	@AfterSuite
	void sampleMethod8()
	{
		System.out.println("AfterSuite");
	}

}
