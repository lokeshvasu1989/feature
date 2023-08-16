package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepD 
{


	@Given("Iam on landing page")
	public void iam_on_landing_page() {
	   System.out.println("Landing Page");
	}
	@When("User logins with uname {string} and password {string}")
	public void user_logins_with_uname_and_password(String string, String string2) {
	    System.out.println(string);
	    System.out.println(string2);
	}
	@Then("Home page populates")
	public void home_page_populates() {
	    System.out.println("home page populates");
	}








}






