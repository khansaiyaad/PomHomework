package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    LoadProp loadprop=new LoadProp();
    public void enterPersonalDetails(){
        typeText(By.id("FirstName"), loadprop.getProperty("firstName"));//enter first name
//        System.out.println(getAttribute(By.id("FirstName"),"value"));
//        System.out.println(getAttribute(By.id("FirstName"),"data-val-required"));
        System.out.println(getAttribute(By.id("FirstName"),"value"));

        typeText(By.id("LastName"), loadprop.getProperty("lastName"));  //enter last name
        //type email
        typeText(By.id("Email"), Email);    //here Email is a String implemented in Utils.java where Email=loadprop.getProperty("emailpart1")+recentDate()+"@gmail.com" , this is done to use the same email id while the user logins.
        //type password
        typeText(By.id("Password"), loadprop.getProperty("password"));

        //type confirmed pass
       typeText(By.id("ConfirmPassword"), loadprop.getProperty("password"));

        //click on reg submit button
        clickOnElement(By.id("register-button"));
    }

}
