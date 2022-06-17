package com.cydeo.stepDefinitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinition {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

  /*  @When("user types {word} and clicks enter")
    public void userTypesAndClicksEnter2(String searchKeyword) {

        googleSearchPage.searchBox.sendKeys(searchKeyword+Keys.ENTER);
    }


   */
    @When("user types {string} and clicks enter")
    public void userTypesAndClicksEnter(String searchKeyword) {

googleSearchPage.searchBox.sendKeys(searchKeyword+Keys.ENTER);
    }

    @Then("user sees {string} in the google title")
    public void userSeesInTheGoogleTitle(String searchKeyword) {

        String expectedTitle = searchKeyword+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not as expected!",expectedTitle, actualTitle);

    }


   @Then("user should see title is Google.")
    public void user_should_see_title_is_google() {
String expectedTitle = "Google";
String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.getDriver().quit();
    }



    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {

        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);

    }

    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {


        String expectedTitle = "apple - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user is on the Google search page.")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://google.com");
    }

}
