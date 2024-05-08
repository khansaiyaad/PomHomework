package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends  Utils {
    private By _desktop= By.xpath("//a[text()=' Desktops ']");

    public void clickOnDesktop(){
       clickOnElement(_desktop);
    }
}
