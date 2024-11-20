package com.skylink.automation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Basic Understanding of JAVA - Done!!
 * How to setup web driver - Done!! (Kingley, Wisdom, Emmanuel)
 * How to use web driver to interact with browser/ website - Done!!
 *
 * Naming conventions: ** code styles **
 * CUCUMBER -
 */

@RunWith(JUnit4.class)
public class NelsonsClassTest {

    int firstNumber = 10;
    int secondNumber = 5;

    String firstString = "Hello";
    String secondString = "World!";

    // String, int, float, doubles, boolean
    // read about arrays
    // I want to see if all home screen buttons have correct text
    @Test
    public void testingAString(){
        String result = firstString + secondString + (firstNumber - secondNumber);
        assertEquals("HelloWorld!5", result);
    }

    @Test
    public void whenAddingTwoNumbersShouldReturnMe15() {
        int result = firstNumber + secondNumber;
        assertEquals(15, result);
    }

    @Test // annotation
    public void whenSubtractingTwoNumbersShouldReturn5(){
        int result = secondNumber - firstNumber;
        assertEquals(-5, result);
    }
}
