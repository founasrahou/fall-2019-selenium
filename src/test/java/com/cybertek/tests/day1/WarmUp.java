package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
driver.manage().window().maximize();
        String expectedTitle = "bookit";
        String actualTitle=driver.getTitle();

        if(expectedTitle.equals(actualTitle)) {

            System.out.println("pass");


        }else{
            System.out.println("Fail");
            System.out.println("i expected to see  = " + expectedTitle);
        }
        driver.close();


    }
}
