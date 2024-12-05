package com.salam.firstLesson;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class MyFirstFeature {

    @Given("User is on contact us page")
    public void user_is_on_contact_us_page() {

    }

    @Then("User enters following data in contact us form")
    public void user_enters_following_data_in_contact_us_form(DataTable dataTable) {

        int numberOfRows = dataTable.height();
        System.out.println("Table number of rows: " + numberOfRows);

        int numberOfColumns = dataTable.width();
        System.out.println("Table number of columns: " + numberOfColumns);

        String item = dataTable.cell(3, 0);
        System.out.println("Item at 3 : 0 -> " + item);

        List<String> firstRow = dataTable.row(0);
        // | name  | name@Test.com  | test subject | test message |
        System.out.println("name: " + firstRow.get(0));
        System.out.println("email: " + firstRow.get(1));
        System.out.println("subject: " + firstRow.get(2));
        System.out.println("message: " + firstRow.get(3));

        // run the loop as many times as there are rows in the table
        for (int counter = 0; counter < dataTable.height(); counter++) {
            List<String> row = dataTable.row(counter);
            System.out.println(row);
        }
    }
}
