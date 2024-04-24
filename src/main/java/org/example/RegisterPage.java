package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    public void enterPersonalDetails(){
        typeText(By.id("FirstName"), "abhi");//enter first name
        typeText(By.id("LastName"), "abhi");  //enter last name
        //type email
        typeText(By.id("Email"), email);
        //type password
        typeText(By.id("Password"), password);

        //type confirmed pass
       typeText(By.id("ConfirmPassword"), password);

        //click on reg submit button
        clickOnElement(By.id("register-button"));
    }

}
