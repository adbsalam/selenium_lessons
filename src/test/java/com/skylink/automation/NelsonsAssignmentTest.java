package com.skylink.automation;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

/**
 * Take care of spaces -  extra spaces
 * Organise code logically
 * Naming
 * <p>
 * command + option + L
 * Ctrl + Alt + L
 * <p>
 * 1 linebreak between 2 functions
 * <p>
 * SOLID -
 * S - SINGLE RESPONSIBILITY PRINCIPLE
 * <p>
 * <p>
 * Run tests on the form based on all the names in the names array
 */
@RunWith(JUnit4.class)
public class NelsonsAssignmentTest {

    ChromeDriver chromeDriver = new ChromeDriver();
    /**
     * position in an array starts with a 0
     */
    String[] nameArray = {"NameZero", "NameOne", "NameTwo", "NameThree", "NameFive", "NameSix"};
    int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 7};

    @Before
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/muhammadabdulsalam/Dev/intelij/driver/chromedriver");

        chromeDriver.get("https://skylinkimpact.com");

        Thread.sleep(2000);
    }

    @Test
    public void testPrintOutNamesFromTheArray() {
        /**
         * Loop
         * For Loop
         * For Each Loop - for each element in the array do something
         * While Loop
         */

        // for each loops
        for (String nameOfStudents : nameArray) {
            System.out.println("printing name: " + nameOfStudents);
        }

        for (int number : numbersArray) {
            System.out.println("printing number" + number);
        }
    }


    @Test
    public void testConsultingButtonNavigatesUserToConsultingUrl() throws InterruptedException {
        WebElement consultingButton = chromeDriver.findElement(By.xpath("/html/body/main/nav/div/div[2]/a[1]"));
        assertEquals("Consulting", consultingButton.getText());
        consultingButton.click();
        Thread.sleep(2000);
        assertEquals("https://www.skylinkimpact.com/consulting", chromeDriver.getCurrentUrl());
        chromeDriver.quit();
    }

    @Test
    public void testEnquiryFormWhenUserProvidesDataThenFormCanBeSubmitted() throws InterruptedException {
        WebElement contactUsButton = chromeDriver.findElement(By.xpath("/html/body/main/nav/div/div[2]/a[4]"));
        contactUsButton.click();
        Thread.sleep(2000);

        WebElement nameField = chromeDriver.findElement(By.id("name"));
        nameField.clear();
        nameField.sendKeys("Rey");

        chromeDriver.findElement(By.id("email")).sendKeys("explorers91@gmail.com");
        chromeDriver.findElement(By.id("subject")).sendKeys("Automation Exercise Test");
        chromeDriver.findElement(By.xpath("//*[@id=\"serviceRequest\"]/option[2]"));
        chromeDriver.findElement(By.id("message")).sendKeys("Hello Abdul and Richie!");

        chromeDriver.findElement(By.xpath("/html/body/main/div[2]/div/form/div/button")).submit();

        System.out.println("Test Successful!");
        Thread.sleep(5000);
        chromeDriver.quit();
    }
}

/**
 * Assignment:
 * <p>
 * Make me at-least 2 examples of each of these loops 'For Loop' and 'While Loop'
 * You should run tests on sumbit form again - Test for each name in following data
 * "NameZero", "NameOne", "NameTwo", "NameThree", "NameFive", "NameSix"
 *
 * read more about : Java Records
 */