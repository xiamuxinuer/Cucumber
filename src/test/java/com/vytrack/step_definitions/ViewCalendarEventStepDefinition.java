package com.vytrack.step_definitions;

import com.vytrack.pages.activities.CalendarEventsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ViewCalendarEventStepDefinition {

    CalendarEventsPage calendarEventsPage=new CalendarEventsPage();


    @Then("View Per Page menu should have following options")
    public void view_Per_Page_menu_should_have_following_options(List<String> dataTable) {
        System.out.println("user views all calendar events");
        System.out.println("expected "+dataTable );
       // System.out.println("actual " +calendarEventsPage.getViewPerPageOptions());

    Assert.assertEquals(dataTable, calendarEventsPage.getViewPerPageOptions());

    }


}
