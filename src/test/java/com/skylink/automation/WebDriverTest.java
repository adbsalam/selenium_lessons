package com.skylink.automation;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Downloaded chrome driver
 * Extract files
 * Copy and paste to a location in Dev folder
 */
@RunWith(JUnit4.class)
public class WebDriverTest {

    /**
     * How to inspect elements on google chrome
     * How to use selenium web elements
     */

    @Before
    public void setup() {
        // first part is the ID
        // second part is the location
        System.setProperty("webdriver.chrome.driver", "/Users/muhammadabdulsalam/Dev/intelij/driver/chromedriver");
    }

    @Test
    public void webDriverTest() {
        //create a new chrome driver object
        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://automationexercise.com/");
    }

}
