package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second) {

        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }


    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();


        for (String each : allWindowsHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL = " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

        }
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));


    }

    public static void verifyTitle(String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }

    public static void verifyTitleContains(String expectedInTitle) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInTitle));
    }

    public static List<String> dropdownOptionsAsString(WebElement dropdownElement) {
        Select select = new Select(dropdownElement);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();
        List<String> actualOptionsAsString = new ArrayList<>();
        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }
return actualOptionsAsString;
    }


}
