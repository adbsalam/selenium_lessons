package com.salam.firstLesson;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeDriverTest {

    ChromeDriver chromeDriver = new ChromeDriver();

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/muhammadabdulsalam/Dev/intelij/driver/chromedriver");

        chromeDriver.get("https://admin.staging.skylinkimpact.com");
    }

    /**
     * Everything on your website is a web element
     * Always find the IDs -
     * xpath -> location of an item on the website/screen
     *
     * sleep will be in milli seconds which is 1s = 1000ms
     */
    @Test
    public void myFirstClickTest() throws InterruptedException {
        WebElement continueButton = chromeDriver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[2]/div/div/div/div/a"));

        continueButton.click();

        Thread.sleep(2000);



        WebElement emailText = chromeDriver.findElement(By.xpath("//*[@id=\"undefined-:r2:\"]"));

        emailText.sendKeys("test.test@gmail.com");

        Thread.sleep(2000);

        chromeDriver.quit();
    }

}
