package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class DesktopPage extends Utils {
    public void verfiyeachProducthastitle(){
        //store list
        List<WebElement> prodTitle=driver.findElements(By.xpath("//div[@class='item-grid']//h2"));
        //System.out.println(prodTitle.size());// to verify correct locator

        //iterate each list element
        for(WebElement Title:prodTitle){ //1,2,3
            System.out.println(Title.getText());
            Assert.assertNotNull(Title.getText(),"prod title is missing");
        }
    }
}
