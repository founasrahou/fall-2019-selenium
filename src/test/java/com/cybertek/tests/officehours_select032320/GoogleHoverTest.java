package com.cybertek.tests.officehours_select032320;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleHoverTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    /**
     * Go to google.com
     * Move your mouse on top of I am feeling lucky
     * Verify that button now has a different text
     * Move the mouse away
     * Do this many times
     * When you get “I am feeling stellar” 3 times, print “Deal with it” in console and exit the program
     */

    @Test
    public void test(){
        Actions actions = new Actions(driver);
        WebElement button = driver.findElement(By.id("gbqfbb"));

        actions.
                pause(4000).moveToElement(button).pause(4000).
                build().perform();
        String notunExpected = "I'm Felling lucky";
        String actual = button.getAttribute("value");
        System.out.println("actual = " + actual);
        Assert.assertNotEquals(actual,notunExpected);
}

}
