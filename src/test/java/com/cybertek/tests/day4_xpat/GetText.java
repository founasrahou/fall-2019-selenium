package com.cybertek.tests.day4_xpat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailbox=driver.findElement(By.name("email"));
        //enter email---->sendkeys()
        emailbox.sendKeys(("abc@gmail.com"));
        WebElement submtbttn= driver.findElement(By.id("form_submit"));
        submtbttn.submit();
        // verify that the confirmation text "your email been sent"

        WebElement message = driver.findElement(By.name("confirmation_message"));
        // getText()
        String actualText = message.getText();


    }
}
