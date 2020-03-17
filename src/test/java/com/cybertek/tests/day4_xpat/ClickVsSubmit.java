package com.cybertek.tests.day4_xpat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickVsSubmit {
    public static void main(String[] args) {
        /*
        Click()
        sybmit()
        task:
        1. go to forgot password web page
        http://practice.cybertekschool.com/forgot_password
       2.  enter any email
       3. click "retrieve password" bttb
        4. verify the URL is:
        http://practice.cybertekschool.com/email_sent

        go to forgot password web page
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailbox=driver.findElement(By.name("email"));
        //enter email---->sendkeys()
        emailbox.sendKeys(("abc@gmail.com"));
        WebElement submtbttn= driver.findElement(By.id("form_submit"));
        submtbttn.submit();
        // verify


    }
}
