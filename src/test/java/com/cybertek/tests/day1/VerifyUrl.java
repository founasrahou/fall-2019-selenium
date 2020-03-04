package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {
    public static void main(String[] args) {
        /*
        go to etsy httpps://etsy.com/
        verify URL

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://wwww.etsy.com/");
        driver.manage().window().maximize();
        // verify title we use get title method
        // verify url we use   ---->getcurrentUrl
        String expectedURL ="https://wwww.etsy.com/";
        String actualURL = driver.getCurrentUrl();
       if(expectedURL.equals(actualURL)){
           System.out.println("pass");
       }else{
           System.out.println("Fail");
           System.out.println("i expected "+expectedURL );
           System.out.println("the actualURL is = " + actualURL);
       }
       driver.close();

    }
}
