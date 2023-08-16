package StepDeff;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepp {




	@Given("Iam on landing page")
	public void iam_on_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("LANDING PAGE");
	    throw new io.cucumber.java.PendingException();
	}
	@When("User logins with uname {string} and password {string}")
	public void user_logins_with_uname_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
		System.out.println(string2);
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Home page populates")
	public void home_page_populates() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home page populates");
	    throw new io.cucumber.java.PendingException();
	}









}
