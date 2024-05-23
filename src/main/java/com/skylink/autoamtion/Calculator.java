package com.skylink.autoamtion;

// all code needs to be within classes
public class Calculator {

    //variables in java
    /**
     * Type name = aValue
     * every line ends with a semicolon ;
     * String : this is just a text
     * <p>
     * Float, Double, Long
     */

    String hello = "Hello World!";
    int myNumber = 1;
    boolean isValue = false;

    /**
     * + - * /
     * void is a function or a method
     * public void nameOfFunction () {
     *
     * }
     * sout to complete print code
     */
    public int additionFunction() {
        int firstNumber = 10;
        int secondNumber = 12;
        int result = firstNumber + secondNumber;
        System.out.println("result of addition = " + result);
        return result;
    }

    public void subtractionFunction() {
        System.out.println("I am subtraction");
    }

    public void divisionFunction() {
        System.out.println("I am a division");
    }

    public void multiplicationFunction() {
        System.out.println("I am multiply");
    }
}

