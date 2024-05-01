package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils{
    LoadProp loadProp=new LoadProp();
    String Browser=loadProp.getProperty("browser");
//    String Browser=System.getProperty("browser");    runtime browser input
    public void openBrowser(){
//        driver = new ChromeDriver();
                               if(Browser.equalsIgnoreCase("Chrome")){
                                   System.out.println("Your browser is chrome");
                                   driver=new ChromeDriver();
                               } else if (Browser.equalsIgnoreCase("edge")) {
                                   System.out.println("Your browser is edge");
                                   driver=new EdgeDriver();

                               } else if (Browser.equalsIgnoreCase("firefox")) {
                                   System.out.println("Your browser is firefox");
                                   driver=new FirefoxDriver();
                               }else{
                                   System.out.println("Your browser is wrong: "+Browser);
                               }


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(loadProp.getProperty("url"));
    }
    public void closeBrowser(){
        driver.quit();
    }
}
