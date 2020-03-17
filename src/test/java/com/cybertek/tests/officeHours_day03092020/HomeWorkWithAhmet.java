package com.cybertek.tests.officeHours_day03092020;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeWorkWithAhmet {
    private static WebDriverFactory BrowserFactory;
    private static Object Threat;

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://ebay.com");
        Thread.sleep(2000);
        WebElement searchBox= driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("wooden spoon", Keys.ENTER);
        Thread.sleep(2000);
        WebElement totalResults=  driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']/span"));
        String totalResult1 = totalResults.getText().replace(",","");
        driver.findElement(By.xpath("//a[.='All']")).click();
        Thread.sleep(2000);
        WebElement totalResults2=  driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']/span"));
        String totalResult2 = totalResults2.getText().replace(",","");
        System.out.println(Integer.parseInt(totalResult2));
        if(Integer.parseInt(totalResult2)>Integer.parseInt(totalResult1)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.id(""));
    }
}



