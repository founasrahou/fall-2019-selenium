package com.cybertek.tests.day4_xpat;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class PracticeFactory {
    public static void main(String[] args) {


    // go to google
        WebDriver  driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");




}}
