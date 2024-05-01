package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourOwnCompPage extends Utils{
    LoadProp loadProp=new LoadProp();
    public void selectSecondSecondOptions(){
        selectByVisibleText(By.id("product_attribute_1"), "2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
        selectByVisibleText(By.id("product_attribute_2"),"4GB [+$20.00]");
        clickOnElement(By.id("product_attribute_3_7"));
       clickOnElement(By.id("product_attribute_4_9"));
       clickOnElement(By.id("product_attribute_5_11"));
    }
    public void clickOnaddToCart(){
        clickOnElement(By.id("add-to-cart-button-1"));
    }
    public void clickOnShoppingCart(){
        clickOnElement(By.xpath("//a[text()='shopping cart']"));
    }
   // String expectedmsg="Build your own computer";

    public void checkItemAddedtoCart(){
        String actualmsg = getText(By.className("product-name"));
        Assert.assertEquals(actualmsg,loadprop.getProperty("expectedmessage"),"Actual message does not match Expected message.");
    }
}
