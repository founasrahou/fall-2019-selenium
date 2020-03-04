package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) {
        /*
        GO TO CYBERTEK WEBSITE AND THEN
        VERIFY TITLE expect title:Practice
        actual result Title?--->

         */
        // connect browser and your driver
        // set up browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("i expected "+expectedTitle);
            System.out.println("the actual title is " + actualTitle);
        }
        driver.close();



//        WebDriverManager.chromedriver().setup();
//        WebDriver driver1 = new ChromeDriver();
//        driver.get("http://www.Etsy.com/");
//        driver.manage().window().maximize();
//        String expectedTitle1 ="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
//        String actualTitle1=driver1.getTitle();
//        if(expectedTitle1.equals(actualTitle1)){
//            System.out.println("pass");
//        }else{
//            System.out.println("expected result " + expectedTitle1);
//            System.out.println("the actual result is "+actualTitle1);
//        }
//
//
//
//


    }
}
