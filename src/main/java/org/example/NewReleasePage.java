package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewReleasePage extends  Utils{
    LoadProp loadprop=new LoadProp();
    private By _commentTitle= By.className("enter-comment-title");
    private By _comment= By.className("enter-comment-text");
    private By _commentbutton= By.name("add-comment");

    public void writeComments(){
        typeText(_commentTitle, loadprop.getProperty("commenttitle"));
        typeText(_comment, loadprop.getProperty("comment"));
        clickOnElement(_commentbutton);
    }
    //to check if comment if updated
    public void verifycomment(){
        String comment="News comment is successfully added.";
        Assert.assertEquals(comment,getText(By.className("result")),"comment is not uploaded.");
    }
}
