package com.skylink.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "classpath:feature", // location of feature files
        glue = "com.skylink.automation", // location of your test files
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports/cucumber.json"}    // use for reports or addition functionality
)
@RunWith(Cucumber.class)
public class CucumberRunner {

}
