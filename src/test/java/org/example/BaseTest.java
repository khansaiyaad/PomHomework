package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
    BrowserManager browsermanager=new BrowserManager();
  @AfterMethod
    public void tearDown(ITestResult result)
  {
    if (!result.isSuccess()) {
      takeScreenshot(result.getName());
    }
      browsermanager.closeBrowser();
  }
  @BeforeMethod
    public void setup(){
      browsermanager.openBrowser();
  }
}
