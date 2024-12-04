package com.salam.firstLesson;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//my feature files are in `features` and my java tests are in `com.salam.firstLesson`

// features -> location or reference to your feature/gherkins files
// glue -> location of your java files
// plugin -> config related to reporting
@CucumberOptions(
        features = "classpath:features",
        glue = "com.salam.firstLesson",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
@RunWith(Cucumber.class)
public class CucumberRunner {
}
