package com.cybertek.tests.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
// locator 1:ID
        //// GO TO CYBERTEK OKTA LOGIN PAGE
        // write to the text box
        //
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://cybertekschool.okta.com/");
        // write email to the text
        // find element method from webdriver

        WebElement emailBox = driver.findElement(By.id("okta-signin-username"));

        emailBox.sendKeys("founasrahou@hotmail.com");
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.id("okta-signin-password"));

        password.sendKeys("@@Bakery9220");
        Thread.sleep(3000);
        WebElement signIn = driver.findElement(By.className("button button-primary"));
        signIn.click();

        Thread.sleep(3000);

//        Thread.sleep(3000);
//        WebElement pushBotton = driver.findElement(By.id("button button-primary"));
//        pushBotton.click();

    }
}
