package com.cybertek.tests.officehours_select032320;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.*;

public class ReviewAgain {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    /*
go to http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable
    verify that table has dropdown with values Family, Friends, Coworkers, Businesses, Contacts
    select option coworker
    verify that coworker is now selected
    select option contacts
    verify contact is selected
     */
    @Test
    public void test() throws InterruptedException {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable");
Thread.sleep(4000);
Select categories = new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")) )  ;
//getoptions--->gives all avaialable options  as list of web elements
List<WebElement> allOptionsEl=categories.getOptions();
        System.out.println("allOptionsEl = " + allOptionsEl.size());
        List<String> expectedOptions= Arrays.asList("Family", "Friends", "Coworkers", "Businesses", "Contacts");
        // given a list web elements ,extract the text of the elements into list of Strings
        List<String>allOptionStr = BrowserUtils.getElementsText(allOptionsEl);
        Assert.assertEquals(allOptionsEl,expectedOptions);
    }
/*
go to http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable
select option coworker
    verify that coworker is now selected
    select option contacts
    verify contact is selected
 */
@Test
public void test2() throws InterruptedException {
    driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable");
    Thread.sleep(6000);
    Select categories = new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")));
// select option coworker
    categories.selectByVisibleText("Coworkers");
    //verify that Coworker is now selected
    //getfistselectionoption--->returns the currenttly selected option as web element

    String actual =categories.getFirstSelectedOption().getText();
    Assert.assertEquals(actual,"Coworkers");


    // select option contact
    //restart the chrome
  driver.navigate().refresh();
  categories=new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")));
    categories.selectByVisibleText("Contacts");
    //verify that Contact is now selected
    categories = new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")));
    categories.selectByVisibleText("Contacts");

    //
    categories = new Select(driver.findElement(By.cssSelector("select[tabindex='-1']")));
    String actual1 = categories.getFirstSelectedOption().getText();

    Assert.assertEquals(actual1, "Contacts");
}
    /**
     * go to http://practice.cybertekschool.com/dropdown
     * verify that days table has days sorted in ascending order
     */
    @Test
    public void test3(){
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select days = new Select(driver.findElement(By.id("day")));
        List<WebElement> options=days.getOptions();
        System.out.println("options.size() = " + options.size());


        //i have a list of web elements, verify all the values are sorted in ascending orders
        // list of web element to list  of string
        List<String>stringlist = BrowserUtils.getElementsText(options);
        // list of string to list of ints
        List <Integer>ints= new ArrayList<>();
        for (String string :stringlist) {
            ints.add(Integer.parseInt(string));

        }
        System.out.println( ints);
        //verify list ints is sorted

        // create  new class with values of the given list
        List<Integer>intsCopy = new ArrayList<>(ints);

        // sorting the copy
        Collections.sort(intsCopy);
        // finally compare
        Assert.assertEquals(ints,intsCopy);

         {

        }


    }

}