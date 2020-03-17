package com.cybertek.tests.day4_xpat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      driver.get("http://practice.cybertekschool.com/dynamic_loading");
      WebElement example1=driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
      // print out href
        System.out.println(example1.getAttribute("href"));
//only with getter

    }
}
