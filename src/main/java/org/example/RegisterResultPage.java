package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
public class RegisterResultPage extends Utils{
    String expmsg="Your registration completed";
    public void verifyUserisRegisteredSuccessfully(){
        String actualmsg = getText(By.className("result"));
        Assert.assertEquals(actualmsg,expmsg);
    }
    public void clickOnContinue(){
        clickOnElement(By.xpath("//a[text()='Continue']"));
    }
}
