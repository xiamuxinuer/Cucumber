package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com\\vytrack\\step_definitions",
        features = "src\\test\\resources\\features\\Activities",
        dryRun = false,
        strict = true,
        tags  ="",
        plugin = {"html:target\\default-report",
                "json:target\\cucumber2.json"}
)

public class ActivitiesTestRunner {
}