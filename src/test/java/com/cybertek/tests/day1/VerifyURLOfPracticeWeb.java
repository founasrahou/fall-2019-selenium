package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLOfPracticeWeb {
    public static void main(String[] args) {
        // go to cybertek website and verify and the Url
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
        String expectedURL ="http://practice.cybertekschool.com/";
       String actualURL= driver.getCurrentUrl();
       if(expectedURL.equals(actualURL)){
           System.out.println("Pass");
       }else{
           System.out.println("I expectURL "+actualURL);
           System.out.println("the actualURL = " + actualURL);
       }
       driver.close();

    }
}
