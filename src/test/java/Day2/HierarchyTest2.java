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

public class HierarchyTest2 {
	@Test(priority=1)
	void sampleMethod9()
	{
		System.out.println("Code1");
	}
	@Test(priority=2)
	void sampleMethod10()
	{
		System.out.println("code2");
	}
	
	
	@BeforeClass
	void sampleMethod3()
	{
		System.out.println("beforeClass2");
	}
	@AfterClass
	void sampleMethod4()
	{
		System.out.println("AfterClass2");
	}
	@BeforeMethod
	void sampleMethod1()
	{
		System.out.println("beforeMethod2");
	}
	@AfterMethod
	void sampleMethod2()
	{
		System.out.println("AfterMethod2");
	}

	
}
