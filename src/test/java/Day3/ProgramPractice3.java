package Day3;

import org.testng.annotations.Test;

public class ProgramPractice3 extends ChildClass {
@Test
	void runMethod()
	{
		ProgramPractice3 obj=new ProgramPractice3(); 
		obj.multiply(1, 1, 1);
	}
}
class ChildClass implements Practice
{
	
	void multiply(int a,int b)
	{
		
		System.out.println(a*b);
	}

	void multiply(int a,int b,int c)
	{
		
		System.out.println(a*a*a);
	}

	@Override
	public void multiply() {
		
		
	}

	@Override
	public void multiply(int a) {
		// TODO Auto-generated method stub
		
	}
	
}
interface Practice
{
	default void square()
	{
		
	}
	void multiply();
	void multiply(int a);
}

class BaseClass
{
	
	void multiply(int a,int b)
	{
		
		System.out.println(a*b);
	}

	void multiply(int a,int b,int c)
	{
		
		System.out.println(a*b*c);
	}
	
}
	

