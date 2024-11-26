package com.salam.firstLesson;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {

    @Before
    public void openBrowserAndStartWebsite() {

    }

    /**
     * @ annotation
     * test function always start with `public`
     * void -> means function
     * function names can be as long as you want -  but should be
     * descriptive
     */
    @Test
    public void addLoginEmailAndPasswordPressContinueValidateUserCanLogic() {
        System.out.println("testing my first automation");
    }


    @Test
    public void mySecondLoginAutomationTest() {
        System.out.println("testing my second automation");
    }

    @After
    public void clearMyData() {

    }

}