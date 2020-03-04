package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2 {
    /*
    Task 2:
2. Go to Bookit login page
https://cybertek-reservation-qa.herokuapp.com/sign-in
2. Verify that URL contains “cybertek-reservation”
/
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();
        String  expectedPartialURL = "cybertek-reservation";
        String actualURL = driver.getCurrentUrl();
        if(actualURL.contains(expectedPartialURL)){
            System.out.println("pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedpartialURL: "+expectedPartialURL);
            System.out.println("ActualURL"+actualURL);

        }
        driver.close();

    }
}
