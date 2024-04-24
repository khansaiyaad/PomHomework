package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils{
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser(){
        driver.quit();
    }
}
