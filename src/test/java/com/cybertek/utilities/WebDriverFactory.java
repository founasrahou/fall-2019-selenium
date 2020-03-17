package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

        // write a return method  which returns Webdriver
        // method name is :getDriver
        //it takes string as parameter--->browser
        // returns ChromDriver snf FireFoxDriver
      public static WebDriver getDriver(String browserType){
          // local variable
          WebDriver driver = null;
          switch (browserType) {
              case "chrome":
                  WebDriverManager.chromedriver().setup();
                  driver = new ChromeDriver();
                  break;
              case"firefox":
                  WebDriverManager.firefoxdriver().setup();
                  driver=new FirefoxDriver();
                  break;

          }
          return driver;
      }
    }

