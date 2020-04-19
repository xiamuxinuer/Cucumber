package com.vytrack.pages;


import com.vytrack.utilities.BrowserUtilities;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPageBase{
    @FindBy(id = "prependedInput")
    private WebElement username;

    @FindBy(id = "prependedInput2")
    private WebElement password;

    @FindBy(id = "_submit")
    WebElement loginButton;

    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotPassword;

    @FindBy(css = "[class='alert alert-error']")
    private WebElement warningMessage;





    public void login(String usernameValue, String passwordValue) {
        BrowserUtilities.waitForPageToLoad(10);
        //BrowserUtilities.wait(5);
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }

    public void login() {

        username.sendKeys(ConfigurationReader.getProperty("store_manager"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
    }



    public String getWarningMessageText(){
        return  warningMessage.getText();
    }



}
