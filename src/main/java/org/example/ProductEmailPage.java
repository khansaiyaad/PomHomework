package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailPage extends Utils{
    public void enterDetails(){
        typeText(By.className("friend-email"),friendemail);
//        typeText(By.id("YourEmailAddress"),email);
        typeText(By.id("PersonalMessage"),message);
    }
    public void clickOnSend(){
        clickOnElement(By.xpath("//button[@class='button-1 send-email-a-friend-button']"));
    }
    String expmessage="Your message has been sent.";
    public void verifyEmailIsSentToFriend(){
        String actmessage=getText(By.className("result"));
        Assert.assertEquals(actmessage,expmessage);
    }
}
