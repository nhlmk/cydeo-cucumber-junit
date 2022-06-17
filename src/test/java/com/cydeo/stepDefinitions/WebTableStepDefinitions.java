package com.cydeo.stepDefinitions;

import com.cydeo.pages.WebTableLoginSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.swing.*;
import java.util.Map;

public class WebTableStepDefinitions {

    WebTableLoginSearchPage webTableLoginSearchPage = new WebTableLoginSearchPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("webTableUrl");
        Driver.getDriver().get(url);

    }

  /*  @When("user enters username {string}")
    public void userEntersUsername(String str) {
        webTableLoginSearchPage.usernameBox.sendKeys(str);
    }

    @When("user enters password {string}")
    public void userEntersPassword(String str) {
        webTableLoginSearchPage.passwordBox.sendKeys(str);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginSearchPage.loginButton.click();

    }

   */

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String arg0, String arg1) {
        webTableLoginSearchPage.usernameBox.sendKeys(arg0);
        webTableLoginSearchPage.passwordBox.sendKeys(arg1);
        webTableLoginSearchPage.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

        BrowserUtils.verifyTitleContains("orders");

    }


    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {
        webTableLoginSearchPage.login(credentials.get("username"), credentials.get("password"));

    }
}
