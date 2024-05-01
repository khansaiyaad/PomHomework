package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{
    LoadProp loadprop=new LoadProp();
    public void enterLoginDetails(){
        typeText(By.id("Email"), Email);
        typeText(By.id("Password"), loadprop.getProperty("password"));
    }
    public void clickOnLoginSubmit(){
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
    }
}
