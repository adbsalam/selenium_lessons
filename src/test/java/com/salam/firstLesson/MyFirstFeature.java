package com.salam.firstLesson;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MyFirstFeature {

    @Given("User is on login")
    public void user_is_on_login() {

    }

    // Parameterization of data
    @Then("User enters email {string}")
    public void user_enters_email(String string) {
        System.out.println(string);
    }

    @Then("password should be {int}")
    public void password_should_be(Integer int1) {

    }

}
