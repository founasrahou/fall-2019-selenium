package com.cybertek.tests.day4_xpat;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) {
        // go to login page
        // locate username box with absulate xpath
        // locate username box with relative xpath
        WebDriver driver = WebDriverFactory.getDriver("chrome");
// absoloute xpat
        WebElement userNmaeBox = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div/inpt"));
        userNmaeBox.sendKeys("tom");
        // // tagname [@attribute = "value"]
        //<input type="text" name="username">
        driver.findElement(By.xpath("//input[@type='text']"));


    }
}
