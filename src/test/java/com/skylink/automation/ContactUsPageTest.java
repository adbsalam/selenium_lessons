package com.skylink.automation;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

/**
 * Anything in RED means an error - code will not run
 * Yellow lines - which are the warnings - code will run bit its good to fix them
 * Green line - mean a typo or wrong spellings - code will run
 * <p>
 * Cannot resolve symbol 'Given'
 * <p>
 * We need to define cucumber options
 * These are to customise your cucumber testing
 * <p>
 * Reports will be generated in target folder
 * <p>
 * Data table -
 */
@RunWith(JUnit4.class)
public class ContactUsPageTest {

    @Given("User can press submit button")
    public void user_can_press_submit_button() {

    }

    /**
     * String result = dataTable.cell(2,2);
     * System.out.println("this is my cell value: " + result);
     * get() means get me element at position X
     * List<String> myRowNumberOne = dataTable.row(1);
     * Practise
     */
    @Then("Press submit button with following details")
    public void press_submit_button_with_following_details(DataTable dataTable) {

        /**
         * Counter - a variable to keep how many times loop have run
         * Condition - how many times to run it -  when to stop - run until
         * increment - step
         */

        for(int counter = 0; counter < 8;  counter++){
            System.out.println("counter value now is : " + counter);

            List<String> row = dataTable.row(counter);

            System.out.println("printing counter: " + row);
        }

    }
}
