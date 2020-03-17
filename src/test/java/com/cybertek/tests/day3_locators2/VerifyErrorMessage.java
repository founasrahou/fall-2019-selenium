package com.cybertek.tests.day3_locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
    public static void main(String[] args) {
        /*/
        go to login page
        enter invalid username
        enter invalid password
        verify tthe error  message
        // testers will gather test data in excell sheet
        // generate data from dummy data website
        java faker

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
       Faker faker = new Faker();
       String username = faker.name().fullName();
       String password = faker.app().author();
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");

        driver.findElement(By.id("wooden_spoon")).click();


    }
}
