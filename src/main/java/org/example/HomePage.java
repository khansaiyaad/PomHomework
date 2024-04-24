package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    public void clickOnRegister(){
        clickOnElement(By.className("ico-register"));
    }
    public void clickOnLogin(){
        clickOnElement(By.className("ico-login"));
    }
    public void clickOnElectronic(){
        clickOnElement(By.linkText("Electronics"));
    }
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(By.xpath("//a[text()='Build your own computer']"));
    }
}
