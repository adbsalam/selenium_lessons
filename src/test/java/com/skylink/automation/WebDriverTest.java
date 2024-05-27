package com.skylink.automation;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;

/**
 * Downloaded chrome driver
 * Extract files
 * Copy and paste to a location in Dev folder
 */

/**
 * Most important properties to use
 * ID  -  is the king
 * Universal way by x-path
 * //*[@id="header"]/div/div/div/div[2]/div/ul/li[1]/a
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
    public void webDriverTest() throws InterruptedException {
        //create a new chrome driver object
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.skylinkimpact.com/");
        Thread.sleep(1000); // 1 second == 1000 milli seconds

        WebElement consultingButton =
                chromeDriver.findElement(By.xpath("/html/body/main/nav/div/div[2]/a[1]"));

        assertEquals("Consulting", consultingButton.getText());
        consultingButton.click();

        Thread.sleep(1000);
        assertEquals("https://www.skylinkimpact.com/consulting", chromeDriver.getCurrentUrl());

//        consultingButton.sendKeys("ajsndjkansdkjansdkj");

        Thread.sleep(1000);
        chromeDriver.quit();
    }

}
