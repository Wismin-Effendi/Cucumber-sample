package stepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import io.cucumber.datatable.DataTable;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepsDefinition {
	
    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Validate the browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("Browser is triggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("Check if browser is started");
    }


    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        // something here
    	System.out.println("Landing page");
    }

    @When("User login to application with username \"([^\"]*)\" and password \"([^\"]*)\"")
    public void user_login_to_application_with_username_and_password(String user, String pass) {
    	System.out.println(user);
    	System.out.println(pass);
    }
    
    @When("User sign up with following details")
    public void user_sign_up_with_following_details(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists();
        for (int i=0; i < rows.get(0).size(); i++) {
        	System.out.println(rows.get(0).get(i));
        }
    }
    
    @When("^User login to the application with username (.+) and password (.+)$")
    public void user_login_to_the_application_with_username_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
    	// something here
    	System.out.println("Homepage populated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        // something here
    	System.out.println("Cards displayed!");
    }

}