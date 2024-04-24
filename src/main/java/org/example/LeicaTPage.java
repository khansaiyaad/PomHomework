package org.example;

import org.openqa.selenium.By;

public class LeicaTPage extends Utils{
    public void clickOnEmailAFriend(){
        clickOnElement(By.xpath("//button[@class='button-2 email-a-friend-button']"));
    }
}
