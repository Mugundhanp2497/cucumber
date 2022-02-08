package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hookers1 
{

	@Before(order=3)
	public void a()
	{
	System.out.println("a");	
	}
	@Before(order=2)
	public void b()
	{
		System.out.println("b");
	}
	@Before(order=1)
	public void c()
	{
		System.out.println("c");
	}
	@After(order=1)
	public void aa()
	{
		System.out.println("aa");
	}
	@After(order=2)
	public void bb()
	{
		System.out.println("bb");
	}
	@After(order=3)
	public void cc()
	{
		System.out.println("cc");
	}


	
}
