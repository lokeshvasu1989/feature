package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
@Before("@Smoke")
public void beforeTst()
{
	System.out.println("Before Smoke");
}
@After
public void afterTst()
{
	System.out.println("After Smoke");
}
}
