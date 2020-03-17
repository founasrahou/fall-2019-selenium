package com.cybertek.tests.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        // user story : as i user i should be able to log in vytrack
        //***test case1*****
        // 1-go to Vytrack login page
        //2- write username data:storemanager52
        // write password
        //click login button
        // verify that the user is in the home page
        // ====>test case 2 login invalid cridential====>>>>
        // go to log in page
        // write invalid name
        // write invalid password
        //
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://app.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("prependedInput")).sendKeys("Storemanager51");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        //// FIND LOGIN BUTTON AND CLICK
        WebElement loginButton= driver.findElement(By.id("_submit"));
        loginButton.click();
        // verify that you are in the home page
        String expectedResult  = "Dashboard";
        String actualResult = driver.getTitle();
        if (expectedResult.equals(actualResult)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("Expected "+expectedResult);
            System.out.println("Actual "+actualResult);
        }







    }
}
