package com.automation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDefinition {
    @Given("User John Doe with password abc123 is registered")
    public void user_john_doe_with_password_abc123_is_registered() {
        System.out.println("Registering user John Doe with password abc123");
    }

    @When("User John Doe with password abc123 logs in")
    public void user_john_doe_with_password_abc123_logs_in() {
        System.out.println("John Doe with password abc123 logging in");
    }

    @Then("User John Doe should be navigated to HomePage")
    public void user_john_doe_should_be_navigated_to_home_page() {
        System.out.println("John Doe is on HomePage");
    }
    @When("User John Doe with password wrongPass logs in")
    public void user_john_doe_with_password_wrong_pass_logs_in() {

    }
    @Then("User should be given login error message")
    public void user_should_be_given_login_error_message() {

    }

}
