package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
public class RegisterResultPage extends Utils{
    LoadProp loadProp=new LoadProp();
  //  String expmsg="Your registration completed";
    public void verifyUserisRegisteredSuccessfully(){
        String actualmsg = getText(By.className("result"));
        Assert.assertEquals(actualmsg,loadprop.getProperty("expmsg"),"Actual message does not match Expected message.");
    }
    public void clickOnContinue(){
        clickOnElement(By.xpath("//a[text()='Continue']"));
    }
}
