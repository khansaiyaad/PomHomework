package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage{
    //type email
   public String email = "saiyaad"+ recentDate() +"@gmail.com";
    public String password="abcdefgh";
    public String friendemail = "friend@gmail.com";
    public String message="hey, have a look at this product";
public static void clickOnElement(By by){
    driver.findElement(by).click();
}
public static void typeText(By by,String text){
    driver.findElement(by).sendKeys(text);
}
    public static String getText(By by) {
        return driver.findElement(by).getText();
    }
    public static String recentDate() {
        DateFormat dateformat = new SimpleDateFormat("yyyyMMddhhmmss");
        Date date = new Date();
        return dateformat.format(date);
    }
    public static void selectByVisibleText(By by,String text){
        Select select=new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
}
