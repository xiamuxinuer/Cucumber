package com.vytrack.pages;


import com.vytrack.utilities.BrowserUtilities;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPageBase {
    protected WebDriver driver= Driver.getDriver();
     protected WebDriverWait wait=new WebDriverWait(driver,15);

    @FindBy(css = "#user-menu>a")
   protected WebElement currentUser;

    @FindBy(css = "[class='btn-group pull-right'] > button")
    protected WebElement saveAndClose;



    public AbstractPageBase(){
        PageFactory.initElements(driver,this);
    }

    public void navigateTo(String tabName,String moduleName) throws InterruptedException {
        String tabNameXpath = "//span[@class='title title-level-1' and contains(text(),'"+tabName+"')]";
        String moduleXpath="//span[@class='title title-level-2' and contains(text(),'"+moduleName+"')]";

        WebElement tabElement=driver.findElement(By.xpath(tabNameXpath));
        WebElement moduleElement=driver.findElement(By.xpath(moduleXpath));

        Actions actions=new Actions(driver);
        BrowserUtilities.wait(3);
        actions.moveToElement(tabElement).pause(2000).click(moduleElement).build().perform();
        BrowserUtilities.wait(3);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[class*='loader-mask']")));

    }
    public void waitForLoaderMask() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[class*='loader-mask']")));
    }

public String getCurrentUser(){
        return currentUser.getText();
}

    public void clickOnSaveAndClose() {
        BrowserUtilities.wait(3);
        wait.until(ExpectedConditions.elementToBeClickable(saveAndClose)).click();
        waitForLoaderMask();
    }


}
