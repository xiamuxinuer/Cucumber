package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com\\vytrack\\step_definitions",
        features = "src\\test\\resources\\features",
        dryRun = false,
        strict = false,
        tags = "@smoke_test",
        plugin = {
                "html:target\\smoke_test_default-report",
                "json:target\\cucumber_smokeTest.json",
                "rerun:target\\rerun_smokeTest.txt"
        }

)
public class SmokeTestRunner {
}