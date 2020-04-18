package com.vytrack.step_definitions;

import com.vytrack.utilities.BrowserUtilities;
import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("test setup");
        Driver.getDriver().manage().window().maximize();
        BrowserUtilities.waitForPageToLoad(20);
    }


    @Before("@driver")
    public void specialSetup(){
        System.out.println("setup for driver");

    }
    @After("@driver")
    public void specialTearDown(){
        System.out.println("tear down fo driver only");
    }

    @After
    public void  tearDown(Scenario scenario){
        if (scenario.isFailed()){
            TakesScreenshot takesScreenshot= (TakesScreenshot) Driver.getDriver();
            byte[] image=  takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(image,"image/png",scenario.getName());
        }
        System.out.println("test clean up");
        Driver.closeDriver();
    }










}
