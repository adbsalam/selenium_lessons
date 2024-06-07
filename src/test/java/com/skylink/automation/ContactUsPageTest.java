package com.skylink.automation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Anything in RED means an error - code will not run
 * Yellow lines - which are the warnings - code will run bit its good to fix them
 * Green line - mean a typo or wrong spellings - code will run
 *
 * Cannot resolve symbol 'Given'
 *
 * We need to define cucumber options
 * These are to customise your cucumber testing
 *
 * Reports will be generated in target folder
 *
 * Data table -
 */
@RunWith(JUnit4.class)
public class ContactUsPageTest {

    @Given("User is on skyline website")
    public void user_is_on_skyline_website() {

    }

    @Then("User clicks on contacts us button")
    public void user_clicks_on_contacts_us_button() {

    }

//    And Press submit button with following details
//    |salam  |salam@test.com|
//            |second |second@Test.com|
//            |third  |third@test.com |
//            # horizontal is a row
//  # vertical is a column
//    @Then("Press submit button with following details")
//    public void press_submit_button_with_following_details(io.cucumber.datatable.DataTable dataTable) {
//        dataTable.height(); // number of rows
//        dataTable.width(); // how many column
//        dataTable.row(0); // get me row number at index
//        dataTable.column(0); // get me column number at index
//    }
}
