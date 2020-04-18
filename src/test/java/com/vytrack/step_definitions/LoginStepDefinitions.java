package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.activities.CalendarEventsPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.Callable;

public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("open login page");
        String URL= ConfigurationReader.getProperty("qa2");
        Driver.getDriver().get(URL);

    }

    @When("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {
        System.out.println("login as sales manager");
        loginPage.login("salesmanager110","UserUser123");
    }
    @When("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
        System.out.println("login as store manager");
        loginPage.login("storemanager85","UserUser123");
    }

    @When("user logs in as a driver")
    public void user_logs_in_as_a_driver() {
        System.out.println(" login as driver");
        loginPage.login(ConfigurationReader.getProperty("driver"),ConfigurationReader.getProperty("password"));
    }


    @When("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.println("login with parameter");
       loginPage.login(string,string2);
    }

    @Then("user should verify that title is a Dashboard")
    public void user_should_verify_that_title_is_a_Dashboard() {
        System.out.println("verify that title is a Dashboard");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Dashboard");
    }

    @When("user navigates to {string} and {string}")
    public void user_navigates_to_and(String tab, String module) throws InterruptedException {
        System.out.println("user navigates to "+tab+" "+module+" page");
        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();
        calendarEventsPage.navigateTo(tab,module);
    }








    }








