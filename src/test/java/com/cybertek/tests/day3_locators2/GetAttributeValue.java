package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        // i want to get the value of attribute
        // type ="text---> getAttribute(attribute name)
        // locate user name  box
        WebElement username= driver.findElement(By.name("username"));
        //<input type="text" name="username">
        String valueOfType= username.getAttribute("type");
        System.out.println("value of type is: "+ valueOfType);


        WebElement loginbttn =driver.findElement(By.id("wooden_spoon"));
        // i want to print class attributes value
        System.out.println(loginbttn.getAttribute("class"));

    }
}
