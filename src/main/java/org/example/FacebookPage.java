package org.example;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class FacebookPage extends  Utils{
    private By _closeButton=By.xpath("//div[@class='x92rtbv x10l6tqk x1tk7jg1 x1vjfegm']");
    FacebookVerificationPage FacebookVerificationPage = new FacebookVerificationPage();

    public void clickOnClose(){
    clickOnElement(_closeButton);
}
    public void toOpenFacebookVerifyAndComeBackOnMainSite()
    {       String MainWindow=driver.getWindowHandle();
        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();
        while(i1.hasNext())
        {
            String ChildWindow=i1.next();
            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                //Wait For Element To Be Clickable For Facebook Cookies Accept
//                elementToBeClickableForCookies();
                //Click On Cancel Button
                clickOnClose();
                //Verify Facebook Page Title
                FacebookVerificationPage.verifyPageName();
                //Verify Facebook Page URL
                FacebookVerificationPage.verifyPageUrl();
                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window
        driver.switchTo().window(MainWindow);
    }
}
