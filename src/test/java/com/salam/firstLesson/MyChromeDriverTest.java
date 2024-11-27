package com.salam.firstLesson;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class MyChromeDriverTest {

    ChromeDriver chromeDriver = new ChromeDriver();

    @Before
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/muhammadabdulsalam/Dev/intelij/driver/chromedriver");

        chromeDriver.get("https://automationexercise.com");
        Thread.sleep(2000);
    }

    @Test
    public void testMyTopNavigationMenu() throws InterruptedException {
        WebElement productsMenu = chromeDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"));
        productsMenu.click();
        Thread.sleep(2000);

        assertEquals("https://automationexercise.com/products", chromeDriver.getCurrentUrl());
    }

}
