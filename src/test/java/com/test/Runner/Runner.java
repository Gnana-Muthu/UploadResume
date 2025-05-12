package com.test.Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;

import com.test.Utilities.Sendmail;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources",
		glue={"com.test.StepDefinition"},
		plugin= {"pretty"},

		dryRun=false,
		monochrome=true,
		strict=true
		//tags= {"@login","@Kids","@Store","@Search"}
		//tags= {"@Urban"}
		)


public class Runner extends AbstractTestNGCucumberTests {
	@AfterSuite
	public void test() {
		Sendmail.sentEmail();
	}

}


