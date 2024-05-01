package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailPage extends Utils{
    LoadProp loadprop=new LoadProp();
    public void enterDetails(){
        typeText(By.className("friend-email"), loadprop.getProperty("friendemail"));
//        typeText(By.id("YourEmailAddress"),Email);
        typeText(By.id("PersonalMessage"), loadprop.getProperty("message"));
    }
    public void clickOnSend(){
        clickOnElement(By.xpath("//button[@class='button-1 send-email-a-friend-button']"));
    }
    //String expmessage="Your message has been sent.";
    public void verifyEmailIsSentToFriend(){
        String actmessage=getText(By.className("result"));
        Assert.assertEquals(actmessage,loadprop.getProperty("expmessage"),"Actual message does not match with Expected message.");
    }
}
