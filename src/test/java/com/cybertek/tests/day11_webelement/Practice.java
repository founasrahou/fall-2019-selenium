package com.cybertek.tests.day11_webelement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
/*
go to http://practice.cybertekschool.com/radio_buttons
verify the all sports checkboxes are NOT checked by default
randomly click any sport
verify that that sport is clicked
verify that all others are not clicked
repeat the last step for 5 times
 */

public class Practice {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get(" http://practice.cybertekschool.com/radio_buttons");

    }

    @AfterMethod
    public void afterTest() {
       // driver.quit();
    }

   @Test
   public  void checkBoxes(){
       driver.get("http://practice.cybertekschool.com/radio_buttons");
       List<WebElement> list = driver.findElements(By.name("sport"));
       System.out.println(list.size());
       //checking all the sport checkboxes are not checked
       for (int i = 0; i <list.size() ; i++) {
           Assert.assertFalse(list.get(i).isSelected());
       }
       //randomly clicking and verifying
       Random ran =new Random();
       for (int q = 0; q <5 ; q++) {
           for (int i = 0; i < list.size(); i++) {
               int num = ran.nextInt(4);
               list.get(num).click();
               if (i == num) {
                   Assert.assertTrue(list.get(num).isSelected());
               } else {
                   Assert.assertFalse(list.get(i).isSelected());
               }
           }
       }}}
