package stepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("the user is on the login page")
    public void user_on_login_page() {
        System.out.println("Navigated to login page");
    }

    @When("the user enters valid username and password")
    public void user_enters_valid_credentials() {
        System.out.println("Entered username and password");
    }

    @Then("the user should be redirected to the dashboard")
    public void user_redirected_to_dashboard() {
        System.out.println("Redirected to dashboard");
    }
}
