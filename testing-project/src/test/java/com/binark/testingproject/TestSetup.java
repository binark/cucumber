package com.binark.testingproject;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        plugin = {"pretty", "html:target/cucumber-report/index.html", "json:target/cucumber-report/report.json"},
        monochrome = true)
public class TestSetup {

}
