package org.example;

import org.openqa.selenium.By;

public class ElectronicPage extends Utils{
    public void clickOnCameraAndPhoto(){
        clickOnElement(By.linkText("Camera & photo"));
    }
}
