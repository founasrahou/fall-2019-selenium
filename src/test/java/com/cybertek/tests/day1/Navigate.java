package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // I want to see the full size
        driver.manage().window().fullscreen();
        String practiceWebURL ="http://practice.cybertekschool.com/";
        driver.get((practiceWebURL));
        String gglURL = "https://www.google.com";
        driver.navigate().to(gglURL);
        Thread.sleep(3000);
        //back to practice
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        // close drive
        driver.close();
        driver.quit();







    }
}
