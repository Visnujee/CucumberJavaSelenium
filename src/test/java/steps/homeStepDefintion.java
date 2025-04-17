package steps;

import dataProvider.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homepage;
import dataProvider.ConfigFileReader;

import java.io.IOException;
import java.util.Properties;

public class homeStepDefintion  {
    homepage hp =new homepage();

    @Given("I navigate to the homepage")
    public void i_navigate_to_the_homepage() throws InterruptedException, IOException {
        hp.navigateHomepage();
    }
    @When("Navigate forgot password link")
    public void navigate_forgot_password_link() throws InterruptedException {
       hp.forgotLink();
    }
    @Then("I should see forgot password page")
    public void i_should_see_forgot_password_page() throws InterruptedException {
        hp.forgotPasswordPage();
    }
}
