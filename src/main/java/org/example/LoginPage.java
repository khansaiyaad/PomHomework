package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{
    public void enterLoginDetails(){
        typeText(By.id("Email"),email);
        typeText(By.id("Password"),password);
    }
    public void clickOnLoginSubmit(){
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
    }
}
