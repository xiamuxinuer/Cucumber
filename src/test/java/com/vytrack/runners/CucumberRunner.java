package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com\\vytrack\\step_definitions",
        features = "src\\test\\resources\\features",
        dryRun = false,
        strict = true,
        tags  ="@create_calendarEvent_data_table",
        plugin = {"html:target\\default-report",
        "json:target\\cucumber.json"}
)
public class CucumberRunner {


}
