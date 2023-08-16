package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("Validate the browser")
	public void validate_the_browser() {
	    System.out.println("Validate the browser");
	}
	@When("Browser is trigrred")
	public void browser_is_trigrred() {
	   System.out.println("Browser Trigerred");
	}
	@Then("Check if the browser is displayed")
	public void check_if_the_browser_is_displayed() {
	   System.out.println("Ckeck if browser is dispalyed");
	}



	@Given("Iam on landing page")
	public void iam_on_landing_page() {
		System.out.println("user is on landing page");
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

	@Then("Cards are displayed {string}")
	public void cards_are_displayed(String string3) {
	   System.out.println(string3);
	}

	@When("User logins with following credentials")
	public void user_logins_with_following_credentials(DataTable dataTable) {
    List<List<String>> obj=dataTable.asLists();
    System.out.println(obj.get(0).get(0));
    System.out.println(obj.get(0).get(1));
    System.out.println(obj.get(0).get(2));
    System.out.println(obj.get(0).get(3));
    System.out.println(obj.get(0).get(4));
	}
	
	@When("User logins with {string} and {string}")
	public void user_logins_with_and(String string, String string2) {
	    System.out.println(string);
	    System.out.println(string2);
	}
}
