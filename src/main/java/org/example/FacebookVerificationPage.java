package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class FacebookVerificationPage extends Utils {
    LoadProp loadProp = new LoadProp();
    String expectedNameOfProduct = loadProp.getProperty("fbpage");
    //create Object For Locator
    private By _pageName = By.xpath("//div[@class='x1e56ztr x1xmf6yo']//h1");

    //Create Method To Verify Page name
    public void verifyPageName()
    {
        Assert.assertEquals(getText(_pageName),expectedNameOfProduct,"incorrect page");
    }
    public void verifyPageUrl()
    {
        String URl = driver.getCurrentUrl();
        Assert.assertTrue(URl.contains("facebook"),"url does not match facebook page url");
    }
}
