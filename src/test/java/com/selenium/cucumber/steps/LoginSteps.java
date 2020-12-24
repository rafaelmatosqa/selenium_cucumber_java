package com.selenium.cucumber.steps;

import com.selenium.cucumber.pojo.User;
import com.selenium.cucumber.support.BaseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class LoginSteps extends BaseUtil {
    private BaseUtil base;


    public LoginSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        base.Driver.navigate().to("https://demosite.executeautomation.com/Login.html");
    }


    @When("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable{

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for(User user: users){
            base.Driver.findElement(By.name("username")).sendKeys(user.username);
            base.Driver.findElement(By.name("password")).sendKeys(user.password);
        }
    }

    @And("I click login button")
    public void iClickLoginButton() {

        base.Driver.findElement(By.name("Login")).submit();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {

       Assert.assertEquals(base.Driver.findElement(By.id("initial")).isDisplayed(),true);
    }


    @When("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) {
    }
}
