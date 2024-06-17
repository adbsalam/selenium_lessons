package com.skylink.automation;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class ContactUsPageTest {

    @Given("User can press submit button")
    public void user_can_press_submit_button() {}

    /**
     * For each only work for a collection of items
     * for loop -  gives you more control
     * practice while loop
     * Counter - a variable to keep how many times loop have run
     * Condition - how many times to run it -  when to stop - run until
     * increment - step
     * <p>
     * <p>
     * // immutable
     * // cannot do record.get(0) instead do record[0]
     * String[] record = {"personOne", "personOne@test.com", "test subject personOne", "Mentoring", "this message is for person one"};
     * String name = record[0]; //personOne
     */
    @Then("Press submit button with following details")
    public void press_submit_button_with_following_details(DataTable dataTable) {
        int height = dataTable.height();

        for (int counter = 0; counter < height; counter++) {
            List<String> row = dataTable.row(counter);
            String name = row.get(0);
            String email = row.get(1);
            String subject = row.get(2);
            String option = row.get(3);
            String message = row.get(4);
            System.out.println("printing name: " + name);
            System.out.println("printing email: " + email);
            System.out.println("printing subject: " + subject);
            System.out.println("printing option: " + option);
            System.out.println("printing message: " + message);
        }
    }
}
