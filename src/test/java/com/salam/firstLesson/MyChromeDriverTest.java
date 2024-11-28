package com.salam.firstLesson;

import io.cucumber.java.bs.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Loops
 * <p>
 * Loop is repeating code
 */
public class MyChromeDriverTest {
    //initialize  Browser
    ChromeDriver chromeDriver = new ChromeDriver();

    // Common  starting steps
    @Before
    public void setUp() throws InterruptedException {
        ArrayList<String> dummyData = new ArrayList<>();

        dummyData.add("//*[@id=\"first_name\"]");
        dummyData.add("//*[@id=\"last_name\"]");
        dummyData.add("//*[@id=\"company\"]");
        dummyData.add("//*[@id=\"address1\"]");
        dummyData.add("//*[@id=\"address2\"]");
        dummyData.add("//*[@id=\"country\"]");
        dummyData.add("//*[@id=\"country\"]");

        for (String xpath : dummyData) {
            WebElement firstNameText = chromeDriver.findElement(By.xpath(xpath));
            firstNameText.sendKeys("lorum");
            Thread.sleep(2000);
        }
    }


}