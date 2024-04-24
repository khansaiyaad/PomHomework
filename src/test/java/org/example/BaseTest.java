package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
    BrowserManager browsermanager=new BrowserManager();
  @AfterMethod
    public void tearDown(){
      browsermanager.closeBrowser();
  }
  @BeforeMethod
    public void setup(){
      browsermanager.openBrowser();
  }
}
