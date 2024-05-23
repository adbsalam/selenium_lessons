package com.skylink.automation;

import com.skylink.autoamtion.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class NelsonsClassTest {

    int firstNumber = 10;
    int secondNumber = 5;

    String firstString = "Hello";
    String secondString = "World!";

    // String, int, float, doubles, boolean
    // read about arrays

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