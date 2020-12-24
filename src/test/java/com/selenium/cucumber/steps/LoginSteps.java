package com.selenium.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
    }


    @When("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
    }

    @And("I click login button")
    public void iClickLoginButton() {
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {

    }


    @When("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) {
    }
}
