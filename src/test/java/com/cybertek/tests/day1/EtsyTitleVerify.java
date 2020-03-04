package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerify {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");
        String expectedTile ="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = driver.getTitle();
        if(expectedTile.equalsIgnoreCase(actualTitle)){
        System.out.println("Pass");

    }else{
            System.out.println("test fail");
            System.out.println(expectedTile+" vs "+actualTitle);
        }
        driver.close();
    }}
