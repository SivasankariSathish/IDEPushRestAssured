package Day2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertAndSoftAssert {
	@Test
	void sampleCheck()
	{
	System.out.println("working");
	}
	@Test(priority=1)
	void checkAssert()
	{
		System.out.println("Assertion Testing");
		Assert.assertEquals(0, 1);
		System.out.println("Asert Fails");
	}
	@Test(priority=2,dependsOnMethods= {"sampleCheck"})
	void checkSoftAssert()
	{
		System.out.println("Soft Assertion Testing");
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(0, 1);
		System.out.println("Assert Fails");
		sa.assertAll();
	}

}
