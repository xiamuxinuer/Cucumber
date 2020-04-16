package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("test setup");
        Driver.getDriver().manage().window().maximize();
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
    public void  tearDown(){
        System.out.println("test clean up");
        Driver.closeDriver();
    }










}
