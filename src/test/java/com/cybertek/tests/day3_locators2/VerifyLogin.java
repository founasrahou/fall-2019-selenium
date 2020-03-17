package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args) {
        /*?
        1-go to login page
        -enter username
        enter password
        -click login btton
        /
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
       driver.findElement(By.name("username")).sendKeys("tomsmith");
       driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
       driver.findElement(By.id("wooden_spoon")).click();
       // locate the welcome message with tagname
       WebElement welcomemessage = driver.findElement(By.tagName("h4"));
       String expectedMessage= "Welcome to the Secure Area. When you are done click logout below.";
       // String vs Webelement
        // getText()-->convert webelment to String
       String actualWelcomeMessage = welcomemessage.getText();
if (expectedMessage.equalsIgnoreCase(actualWelcomeMessage)){
    System.out.println("Pass");
}else{
    System.out.println("fail ");
}

    }
}
