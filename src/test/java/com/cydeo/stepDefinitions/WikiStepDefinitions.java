package com.cydeo.stepDefinitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiStepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get("https://wikipedia.org");
    }
    @When("User types {string} in the Wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
wikiSearchPage.searchBox.sendKeys(string);
    }
    @When("User click wiki search button")
    public void user_click_wiki_search_button() {
wikiSearchPage.searchButton.click();
    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {
       Assert.assertTrue(wikiSearchPage.mainHeader.isDisplayed());
Assert.assertTrue(wikiSearchPage.mainHeader.getText().equals(arg0));
    }
}
