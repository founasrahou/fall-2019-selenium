package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.ebay.com/");
        WebElement searchBox = driver.findElement(By.name("_nku"));
        Thread.sleep(3000);
        searchBox.sendKeys("shoes"+ Keys.ENTER);
       // verify title contains search term
        // expected vs actual
        String expectedPartialTitle = "shoes";
        String actual = driver.getTitle();
        if(expectedPartialTitle.contains(actual)){
            System.out.println("verified");
        }else{
            System.out.println("failed "+actual);
            System.out.println("i expected :" + expectedPartialTitle);
        }
    }
}
