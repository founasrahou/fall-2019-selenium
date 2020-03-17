package com.cybertek.tests.day5_;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfElement {
    public static void main(String[] args) {
        /*
    go to http://practice.cybertekschool.com/dynamic_loading
    locate: Example 1: Element on page that is hidden and become visible after trigger
    print out href attribute's value
     */

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://practice.cybertekschool.com/dynamic_loading");
// TODO linktext
            //locate Example 1
            WebElement exemple1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
//        System.out.println(exemple1.getAttribute("href"));
// TODO partiallinktext
            WebElement example2 = driver.findElement(By.partialLinkText("2:"));
            System.out.println(example2.getText());
        }
    }
