package com.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;

@CucumberOptions(
    features = "src/test/resources",
    glue = {"com.test.StepDefinition"},
    plugin = {"pretty"},
    dryRun = false,
    monochrome = true
    //tags = "@login"
)
public class Runner extends AbstractTestNGCucumberTests {

    @AfterSuite
    public void cleanUp() {
        // Any cleanup code
    }
}
