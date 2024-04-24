package org.example;

import org.openqa.selenium.By;

public class CameraPage extends Utils{
    public void clickOnLeica(){
        clickOnElement(By.linkText("Leica T Mirrorless Digital Camera"));
    }
    public void checkAddToCartButton(){
        int count = driver.findElements(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']")).size();
        if(count==3){
            System.out.println("Add to cart button is present");
        }else{
            System.out.println("Add to cart button not present");
        }
    }
}
