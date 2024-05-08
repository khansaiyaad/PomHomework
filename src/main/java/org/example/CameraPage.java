package org.example;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CameraPage extends Utils{
    public void clickOnLeica(){
        clickOnElement(By.linkText("Leica T Mirrorless Digital Camera"));
    }
    public void checkAddToCartButton(){
//        int count = driver.findElements(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']")).size();
//        if(count==3){
//            System.out.println("Add to cart button is present");
//        }else{
//            System.out.println("Add to cart button not present");
//        }
        List<WebElement> button=driver.findElements(By.xpath("//div[@class='item-grid']//div[@class='buttons']//button[@class='button-2 product-box-add-to-cart-button']"));
for(WebElement title:button){
    System.out.println(title.getText());
    Assert.notNull(title.getText(),"one of the product does not show 'Add To Cart' button.");
}


    }
}
