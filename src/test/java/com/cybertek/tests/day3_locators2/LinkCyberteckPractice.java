package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCyberteckPractice {
    // locate cybertek school
    public static void main(String[] args) {
        WebDriverManager .chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        WebElement cybertekSchool = driver.findElement(By.linkText("Cybertek School"));
        // i can not print the above variable cybertekschool
        // bcz it is a webelemnt
        // in order to print i need getext()
        String textVersion = cybertekSchool.getText();
        System.out.println("textVersion = " + textVersion);
        // locate home element
        WebElement home = driver.findElement(By.linkText("home"));
        String textVersion1=home.getText();
        System.out.println("textVersion1 = " + textVersion1);
    }
}
