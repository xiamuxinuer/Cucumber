package com.vytrack.step_definitions;

import com.vytrack.pages.activities.CalendarEventsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CreateCalendarEventStepDefinition {

    CalendarEventsPage calendarEventsPage=new CalendarEventsPage();

    @Then("user clicks on create calendar event button")
    public void user_clicks_on_create_calendar_event_button() {
        System.out.println("click to create new calendar event");

        calendarEventsPage.clickToCreateCalendarEvent();
        Assert.assertEquals(calendarEventsPage.getSubTitle(),"Create Calendar Event");

    }
    @Then("user enters {string} as title")
    public void user_enters_as_title(String title) {
        System.out.println("user enters title:"+title);
        calendarEventsPage.enterCalendarEventTitle(title);
    }

    @Then("user enters {string} as description")
    public void user_enters_as_description(String description) {
        System.out.println("user enters description:"+description);
calendarEventsPage.enterCalendarEventDescription(description);
    }

    @Then("user clicks on save and close button")
    public void user_clicks_on_save_and_close_button() {
        System.out.println("user clicks on saveAndClose button to save new calender event");
        calendarEventsPage.clickOnSaveAndClose();
    }

    @Then("user verifies that description of new calender event is {string}")
    public void user_verifies_that_description_of_new_calender_event_is(String description) {
        System.out.println("verified description is : "+description );
        Assert.assertEquals(calendarEventsPage.getGeneralInfoDescriptionText(),description);
    }

    @Then("user verifies that title of new calender event is {string}")
    public void user_verifies_that_title_of_new_calender_event_is(String title) {
        System.out.println("verified title is : "+title);
        Assert.assertEquals(calendarEventsPage.getGeneralInfoTitleText(),title);

    }








}
