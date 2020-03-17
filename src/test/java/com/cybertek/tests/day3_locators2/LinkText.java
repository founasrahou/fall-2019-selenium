package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
        // link text===>locator---->
        //<a> is link . in this situation we will use linkText locator to locate the element
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.manage().window().maximize();
        WebElement example3= driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
    String textVersionOfExample3 = example3.getText();
        System.out.println( textVersionOfExample3);
        WebElement example3_2=driver.findElement((By.partialLinkText("Example 3")));
        String text = example3_2.getText();
        System.out.println(text);


    }
}
