package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginSearchPage {


    public WebTableLoginSearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    /**
     * No parameters
     * When we call this method, it will directly login using
     * Username: Test
     * Password: Tester
     */

    public void login(){
        this.usernameBox.sendKeys("Test");
        this.passwordBox.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This method will accepts two arguments and login.
     * @param username
     * @param password
     */

    public void login(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    /**
     * This method logs in with configuration.properties.
     */

    public void loginWithConfig(){
        usernameBox.sendKeys(ConfigurationReader.getProperty("webTableUsername"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("webTablePw"));
        loginButton.click();
    }
}
