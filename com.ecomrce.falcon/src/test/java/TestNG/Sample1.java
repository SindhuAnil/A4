package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample1 {
	
	public void createuser()
	{
		System.out.println("user created");
	}
@Test(enabled=false)
public void modifyuser()
{
	System.out.println("user modifier");
}
@Ignore

public void deleteuser()
{
	System.out.println("user modifier");
	}
}
