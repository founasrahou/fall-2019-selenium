package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello Selenium");
        WebDriverManager.chromedriver().setup();
        // first step open website
        // create webdriver object--->interface
        // how do we create webdriver:
        WebDriver driver = new ChromeDriver();
        // i want to open google home page
        driver.get("https://www.google.com");
        // navigations
        // navigate().to()---->open a web page
        driver.navigate().to("https://www.google.com");
        // get---> wait to load the page
        //  to----->does not wait
        // navigate back ---->
        // go to google and then go to cybertek practice website
        driver.get("https://www.google.com");
        driver.navigate().to("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        // navigate .forward()
        // go to practice website and then google and back to practice website and then move forward to google again
        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();

       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();






    }
}
