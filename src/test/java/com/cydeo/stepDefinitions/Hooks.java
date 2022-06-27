package com.cydeo.stepDefinitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

 /*   @Before(order = 2)
    public void setupScenario() {
        System.out.println("===== Setting up browser using cucumber @Before and order 2 ");

    }

    @Before(value = "@login", order = 1)
    public void setupScenarioForLogins() {
        System.out.println("===== Setting up browser using cucumber @Before value = @login, order = 1");

    }

    @Before(value = "@db", order = 0)
    public void setupForDatabaseScenarios() {
        System.out.println("=======    this will only apply to scenarios with @db");
    }

  */

    @After
    public void tearDownScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        //BrowserUtils.sleep(1);
        Driver.closeDriver();


        // System.out.println("===== Closing browser using cucumber @After ");
        // System.out.println("===== Scenario ended/ take screenshot if failed.");
    }

   /* @BeforeStep
    public void setupStep() {
        System.out.println("====== Applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("====== Applying earDown using @AfterStep");
    }

    */


}
