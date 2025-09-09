package Day2;

import org.testng.annotations.Test;

public class GroupingCheck {
	@Test(priority=1,groups="sanity")
	void sampleCheck1()
	{
	System.out.println("working");
	}
	@Test(priority=2,groups="regression")
	void sampleCheck2()
	{
	System.out.println("working");
	}
	@Test(priority=3,groups={"sanity","regression"})
	void sampleCheck3()
	{
	System.out.println("working");
	}

}
